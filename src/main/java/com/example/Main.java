package com.example;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        TGrafoDirigido VUELE_SEGURO = (TGrafoDirigido) UtilGrafos.cargarGrafo(
                "src\\main\\java\\com\\example\\aeropuertos.txt", "src\\main\\java\\com\\example\\conexiones.txt",
                false, TGrafoDirigido.class);

        LinkedList<TArista> arcosArbol = new LinkedList<>();
        LinkedList<TArista> arcosRetroceso = new LinkedList<>();
        LinkedList<TArista> arcosAvance = new LinkedList<>();
        LinkedList<TArista> arcosCruzados = new LinkedList<>();

        VUELE_SEGURO.clasificarArcos("Montevideo", arcosArbol, arcosRetroceso, arcosAvance, arcosCruzados);
    }
}
