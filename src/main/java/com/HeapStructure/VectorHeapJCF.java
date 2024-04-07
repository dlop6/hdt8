package com.HeapStructure;

import java.util.PriorityQueue;

/**
 * Esta clase representa una implementación de un montículo de vectores utilizando la clase PriorityQueue de Java Collections Framework (JCF).
 * Extiende la clase AbstractVectorHeap y utiliza una PriorityQueue para almacenar los elementos del montículo.
 * 
 * @param <E> el tipo de elementos que se almacenarán en el montículo, debe ser comparable.
 */
public class VectorHeapJCF<E extends Comparable<E>> extends AbstractVectorHeap<E> {
    
    public PriorityQueue<E> data;

    /**
     * Crea un nuevo VectorHeapJCF vacío.
     */
    public VectorHeapJCF() {
        data = new PriorityQueue<E>();
    }

    /**
     * Crea un nuevo VectorHeapJCF con los elementos de la cola de prioridad especificada.
     * 
     * @param q la cola de prioridad que contiene los elementos iniciales del montículo.
     */
    public VectorHeapJCF(PriorityQueue<E> q) {
        data = new PriorityQueue<E>(q);
    }

    /**
     * Devuelve el primer elemento del montículo sin eliminarlo.
     * 
     * @return el primer elemento del montículo.
     */
    public E getFirst() {
        return data.peek();
    }

    /**
     * Agrega un elemento al montículo.
     * 
     * @param value el elemento a agregar.
     * @throws NullPointerException si el elemento es nulo.
     */
    public void add(E value) {
        if (value == null) {
            throw new NullPointerException();
        }

        data.add(value);
    }

    /**
     * Elimina y devuelve el primer elemento del montículo.
     * 
     * @return el primer elemento del montículo.
     * @throws IllegalStateException si el montículo está vacío.
     */
    public E remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return data.poll();
    }

    /**
     * Verifica si el montículo está vacío.
     * 
     * @return true si el montículo está vacío, false de lo contrario.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Elimina todos los elementos del montículo.
     */
    public void clear() {
        data.clear();
    }

    /**
     * Devuelve el número de elementos en el montículo.
     * 
     * @return el número de elementos en el montículo.
     */
    public int size() {
        return data.size();
    }
}
