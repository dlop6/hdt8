package com;

import com.FileReader.FileReader;
import com.HeapStructure.Paciente;
import com.HeapStructure.VectorHeap;

import java.util.List;
import java.util.Scanner;


public class App {

    static VectorHeap<Paciente> heap = new VectorHeap<Paciente>();
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        List<Paciente> pacientes = fileReader.readFile("src/main/java/com/Txt files/pacientes.txt");

        for (Paciente paciente : pacientes) {
            heap.add(paciente);
        }
        
        System.out.println("SISTEMA DE PACIENTAS DE EMERGENCIAS:");
        System.out.println("Escoger una opcion:");
        System.out.println("1. Atender paciente");
        System.out.println("2. Observar lista de pacientes");
        System.out.println("3. Salir");

        Scanner scanner = new Scanner(System.in);
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
