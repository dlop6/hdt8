package com.HeapStructure;

public abstract class AbstractVectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {


    public abstract E getFirst();

    public abstract void add(E value);

    public abstract E remove();
    
    
}
