package com;

import org.junit.Assert;
import org.junit.Test;

import com.HeapStructure.VectorHeapJCF;

public class VectorHeapTest {

    @Test
    public void testAdd() {
        VectorHeapJCF<Integer> heap = new VectorHeapJCF<>();
        heap.add(5);
        heap.add(10);
        heap.add(3);

        Assert.assertEquals(3, heap.getFirst().intValue());
    }

    @Test
    public void testRemove() {
        VectorHeapJCF<String> heap = new VectorHeapJCF<>();
        heap.add("apple");
        heap.add("banana");
        heap.add("cherry");

        String removedElement = heap.remove();

        Assert.assertEquals("apple", removedElement);
        Assert.assertEquals("banana", heap.getFirst());
    }
}