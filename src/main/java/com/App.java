package com;

import com.FileReader.FileReader;
import com.HeapStructure.AbstractVectorHeap;
import com.HeapStructure.Paciente;
import com.HeapStructure.VectorHeapJCF;

import java.util.List;
import java.util.Scanner;


public class App {

    static AbstractVectorHeap<Paciente> heap;
    public static void main(String[] args) {

    
        System.out.println("Escoge que implementacion de heap deseas utilizar: ");
        System.out.println("1. Implementacion propia de heap (VectorHeap)");
        System.out.println("2. Heap de Java Collections Framework (JCF)");

        FileReader fileReader = new FileReader();
        List<Paciente> pacientes = fileReader.readFile("src/main/java/com/Txt files/pacientes.txt");

        for (Paciente paciente : pacientes) {
            heap.add(paciente);
        }

        Scanner scanner = new Scanner(System.in);
        int heapOption = scanner.nextInt();

        if (heapOption == 1) {
            heap = new VectorHeapJCF<>();
        } else if (heapOption == 2) {
            heap = new VectorHeapJCF<>();
        } else {
            System.out.println("Opcion no valida");
        }


        System.out.println("SISTEMA DE PACIENTAS DE EMERGENCIAS:");
        System.out.println("Escoger una opcion:");
        System.out.println("1. Atender paciente");
        System.out.println("2. Observar lista de pacientes");
        System.out.println("3. Salir");
        int option = scanner.nextInt();

        while (option != 3) {
            switch (option) {
                case 1:
                    Paciente paciente = heap.remove();
                    System.out.println("PRIORIDAD: " + paciente.getPrioridad());
                    System.out.println("Paciente atendido: " + paciente.getNombre());
                    System.out.println("Sintoma: " + paciente.getSintoma());
                    break;
                case 2:
                    System.out.println("Lista de pacientes:");
                    for (Paciente p : pacientes) {
                        System.out.println(p.getNombre());
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("Escoger una opcion:");
            System.out.println("1. Atender paciente");
            System.out.println("2. Observar lista de pacientes");
            System.out.println("3. Salir");

            option = scanner.nextInt();
        }

    }
    
}
