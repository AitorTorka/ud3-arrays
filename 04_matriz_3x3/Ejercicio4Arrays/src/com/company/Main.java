package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Crea una matriz de 3x3 elementos pidiendo los valores al usuario. Después, muestra el
      contenido de la matriz por pantalla.
      Para facilitar la visualización es recomendable usar la función System.out.format()*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Creamos la matriz de 3x3.
        int valor = 0;
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Le pedimos los valores a añadir en cada casilla.
                System.out.println("Introduce un valor: ");
                valor = Integer.parseInt(br.readLine());
                matriz[i][j] = valor;
            }
        }

        //Mostramos el resultado en pantalla.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
