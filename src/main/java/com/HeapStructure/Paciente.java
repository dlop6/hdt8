package com.HeapStructure;

public class Paciente implements Comparable<Paciente>{

    private String prioridad;
    private String nombre;
    private String sintoma;

    public Paciente(String prioridad, String nombre, String sintoma) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.sintoma = sintoma;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    @Override
    public int compareTo(Paciente o) {
        return this.getPrioridad().compareTo(o.getPrioridad());
    }
    
}
