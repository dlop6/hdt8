package com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.HeapStructure.VectorHeapImplementation;

public class VectorHeapImplementationTest {

    private VectorHeapImplementation<Integer> heap;

    @Before
    public void setUp() {
        heap = new VectorHeapImplementation<>();
    }

    @Test
    public void testAdd() {
        heap.add(5);
        heap.add(10);
        heap.add(3);

        Assert.assertEquals(3, heap.getFirst().intValue());
    }

    @Test
    public void testRemove() {
        heap.add(5);
        heap.add(10);
        heap.add(3);

        int removedElement = heap.remove();

        Assert.assertEquals(3, removedElement);
        Assert.assertEquals(5, heap.getFirst().intValue());
    }

    @Test(expected = IllegalStateException.class)
    public void testRemoveEmptyHeap() {
        heap.remove();
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(heap.isEmpty());

        heap.add(5);

        Assert.assertFalse(heap.isEmpty());
    }

    @Test
    public void testSize() {
        Assert.assertEquals(0, heap.size());

        heap.add(5);
        heap.add(10);
        heap.add(3);

        Assert.assertEquals(3, heap.size());
    }

    @Test
    public void testClear() {
        heap.add(5);
        heap.add(10);
        heap.add(3);

        heap.clear();

        Assert.assertTrue(heap.isEmpty());
        Assert.assertEquals(0, heap.size());
    }
}