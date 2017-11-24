package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Rellena una matriz de 10x10 con valores aleatorios y muéstrala en pantalla.
        Como recordatorio, para generar números aleatorios entre 0 y 100 podemos usar:
        Random r = new Random();
        int aleatorio = r.nextInt(100);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Creamos la variable aleatoria y la matriz de 10x10.
        Random r = new Random();
        int aleatorio = 0;
        int[][] matriz = new int[10][10];

        /* Introducimos la variable aleatorio en el inicio de la matriz para que genere un numero aleatorio
            en cada vuelta y lo añada a cada celda utilizando como limite de vueltas el Array*/

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aleatorio = r.nextInt(100);
                matriz[i][j] = aleatorio;
            }
        }

        // Visualizamos la matriz completa.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }

    }
}
