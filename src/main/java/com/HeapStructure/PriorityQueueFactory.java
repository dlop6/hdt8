package com.HeapStructure;


/**
 * Esta clase representa una fábrica para crear colas de prioridad.
 * Permite crear diferentes implementaciones de colas de prioridad
 * según el tipo especificado.
 *
 * @param <E> el tipo de elementos que se almacenarán en la cola de prioridad
 */
public class PriorityQueueFactory<E extends Comparable<E>> {

    /**
     * Crea una cola de prioridad según el tipo especificado.
     *
     * @param type el tipo de cola de prioridad a crear
     * @return una instancia de la implementación de la cola de prioridad especificada
     * @throws IllegalArgumentException si se especifica un tipo de cola de prioridad no soportado
     */
    public AbstractVectorHeap<E> createPriorityQueue(String type) {
        switch (type.toLowerCase()) {
            case "vectorheap":
                return new VectorHeapImplementation<>();
            case "vectorheapjcf":
                return new VectorHeapJCF<>();
            default:
                throw new IllegalArgumentException("Tipo de cola de prioridad no soportado: " + type);
        }
    }
}
