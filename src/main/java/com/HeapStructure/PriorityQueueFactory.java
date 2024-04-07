package com.HeapStructure;


public class PriorityQueueFactory<E extends Comparable<E>> {

    public AbstractVectorHeap<E> createPriorityQueue(String type) {
        switch (type.toLowerCase()) {
            case "vectorheap":
                return new VectorHeapImplementation<>();
            case "vectorheapjcf":
                return new VectorHeapJCF<>();
            default:
                throw new IllegalArgumentException("Unsupported priority queue type: " + type);
        }
    }
}
