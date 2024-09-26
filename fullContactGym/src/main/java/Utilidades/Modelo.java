package Utilidades;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    public static final List<Persona> AGENDA = new ArrayList<>();

    public static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aproambiental.dat"))) {
            oos.writeObject(AGENDA);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aproambiental.dat"))) {
            List<Persona> agendaCargada = (List<Persona>) ois.readObject();
            AGENDA.clear();
            AGENDA.addAll(agendaCargada);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}