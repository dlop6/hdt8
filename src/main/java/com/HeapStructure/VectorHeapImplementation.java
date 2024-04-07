package com.HeapStructure;

import java.util.Vector;


/**
 * Esta clase representa una implementación de una estructura de datos de montículo (heap) utilizando un vector.
 * Esta implementación sigue el ordenamiento del montículo y utiliza el tipo genérico E que debe ser comparable.
 * Esta clase fue tomada de JavaStructures de Duane A. Bailey.
 */
public class VectorHeapImplementation<E extends Comparable<E>> extends AbstractVectorHeap<E>{

    protected Vector<E> data; // the data, kept in heap order

    public VectorHeapImplementation() {
        data = new Vector<E>();
    }

    public VectorHeapImplementation(Vector<E> v) {
        int i;
        data = new Vector<E>(v.size()); // we know ultimate size
        for (i = 0; i < v.size(); i++) {
            // add elements to heap
            add(v.get(i));
        }
    }

    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    protected static int left(int i) {
        return 2 * i + 1;
    }

    protected static int right(int i) {
        return (2 * i + 1) + 1;
    }

    public void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    public void add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
    }

    public void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos + 1)).compareTo(data.get(childpos)) < 0)) {
                    childpos++;
                }
                if ((data.get(childpos)).compareTo(value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos; // keep moving down
                } else {
                    // found right location
                    data.set(root, value);
                    return;
                }
            } else {
                // at a leaf! insert and halt
                data.set(root, value);
                return;
            }
        }
    }

    public E remove() {
        if (isEmpty())
            throw new IllegalStateException("Heap is empty");
        E minVal = getFirst();
        data.set(0, data.get(data.size() - 1));
        data.setSize(data.size() - 1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public E getFirst() {
        if (isEmpty())
            throw new IllegalStateException("Heap is empty");
        return data.get(0);
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public void clear() {
        data.clear();
    }
}
