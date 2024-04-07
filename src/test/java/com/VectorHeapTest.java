package com;

import org.junit.Assert;
import org.junit.Test;

import com.HeapStructure.VectorHeap;

public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeap<Integer> heap = new VectorHeap<>();
        heap.add(5);
        heap.add(10);
        heap.add(3);

        Assert.assertEquals(3, heap.peek().intValue());
    }

    @Test
    public void testRemove() {
        VectorHeap<String> heap = new VectorHeap<>();
        heap.add("apple");
        heap.add("banana");
        heap.add("cherry");

        String removedElement = heap.remove();

        Assert.assertEquals("apple", removedElement);
        Assert.assertEquals("banana", heap.peek());
    }
}