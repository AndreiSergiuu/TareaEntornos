package es.medac;

import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {
        Consultas consultas = new Consultas();

        ArrayList<Personas> listaPersonas = consultas.obtenerTodasLasPersonas();

        System.out.println(listaPersonas.toString());

        listaPersonas.clear();

        listaPersonas = consultas.obtenerTodasLasPersonasPorProfesor("Loquendo");

        System.out.println(listaPersonas);

    }
}
