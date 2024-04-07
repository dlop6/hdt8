package com.HeapStructure;

public class Paciente implements Comparable<Paciente>{

    private String prioridad;
    private String nombre;
    private String sintoma;

    /**
     * Crea un nuevo objeto Paciente con la prioridad, nombre y síntoma especificados.
     * 
     * @param prioridad la prioridad del paciente
     * @param nombre el nombre del paciente
     * @param sintoma el síntoma del paciente
     */
    public Paciente(String prioridad, String nombre, String sintoma) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.sintoma = sintoma;
    }

    /**
     * Obtiene la prioridad del paciente.
     * 
     * @return la prioridad del paciente
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Establece la prioridad del paciente.
     * 
     * @param prioridad la prioridad del paciente
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * Obtiene el nombre del paciente.
     * 
     * @return el nombre del paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el síntoma del paciente.
     * 
     * @return el síntoma del paciente
     */
    public String getSintoma() {
        return sintoma;
    }

    @Override
    public int compareTo(Paciente o) {
        return this.getPrioridad().compareTo(o.getPrioridad());
    }
    
}
