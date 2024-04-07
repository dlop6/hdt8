package com.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.HeapStructure.Paciente;

public class FileReader {
    
    public List<Paciente> readFile(String path) {
        List<Paciente> pacientes = new ArrayList<>();

        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                String[] data = line.split(",");
                String name = data[0];
                String symptom = data[1];
                String priority = data[2];

                Paciente paciente = new Paciente(priority, name, symptom);
                pacientes.add(paciente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pacientes;
    }
}
