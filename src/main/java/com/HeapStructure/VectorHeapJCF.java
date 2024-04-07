package com.HeapStructure;

import java.util.PriorityQueue;

public class VectorHeapJCF<E extends Comparable<E>> extends AbstractVectorHeap<E> {
    
    public PriorityQueue<E> data;

    public VectorHeapJCF() {
        data = new PriorityQueue<E>();
    }

    public VectorHeapJCF(PriorityQueue<E> q) {
        data = new PriorityQueue<E>(q);
    }

    public E getFirst() {
        return data.peek();
    }

    public void add(E value) {
        if (value == null) {
            throw new NullPointerException();
        }

        data.add(value);
    }

    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return data.poll();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void clear() {
        data.clear();
    }

    public int size() {
        return data.size();
    }


    
}
