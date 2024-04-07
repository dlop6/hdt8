package com.HeapStructure;

import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E> {
    
    public PriorityQueue<E> data;

    public VectorHeap() {
        data = new PriorityQueue<E>();
    }

    public VectorHeap(PriorityQueue<E> q) {
        data = new PriorityQueue<E>(q);
    }

    @Override
    public boolean add(E value) {
        return data.add(value);
    }

    @Override
    public E remove() {
        return data.remove();
    }

    @Override
    public E peek() {
        return data.peek();
    }
    
}
