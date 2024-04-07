package com.HeapStructure;

/**
 * Esta clase abstracta representa una implementación de la estructura de datos de montículo utilizando un vector.
 * Implementa la interfaz PriorityQueue y define los métodos abstractos para obtener el primer elemento, agregar un elemento y remover un elemento.
 * La clase AbstractVectorHeap es parametrizada con el tipo E, que debe ser comparable para poder realizar comparaciones entre elementos.
 */
public abstract class AbstractVectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    /**
     * Obtiene el primer elemento del montículo.
     *
     * @return el primer elemento del montículo.
     */
    public abstract E getFirst();

    /**
     * Agrega un elemento al montículo.
     *
     * @param value el elemento a agregar.
     */
    public abstract void add(E value);

    /**
     * Remueve y devuelve el elemento de mayor prioridad del montículo.
     *
     * @return el elemento de mayor prioridad del montículo.
     */
    public abstract E remove();
}
