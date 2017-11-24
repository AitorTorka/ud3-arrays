package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Crea una matriz de 3x3 elementos pidiendo los valores al usuario. Después, muestra el
      contenido de la matriz por pantalla.
      Para facilitar la visualización es recomendable usar la función System.out.format()*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*Iniciamos las variables de ambas matrices por separado.
         Nota: he añadido 2 variables aleatorias aunque se podria haber hecho unicamente con 1, lo he hecho
         para situarme mejor a la hora de diferenciar ambas matrices.*/

        int numero = 0;
        Random r = new Random();
        int aleatorio = 0;

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aleatorio = r.nextInt(100);
                matriz[i][j] = aleatorio;
            }
        }

        System.out.println("-----Matriz1----- ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("-----------------");

        Random r2 = new Random();
        int aleatorio2 = 0;

        int[][] matriz2 = new int[4][4];

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                aleatorio2 = r2.nextInt(100);
                matriz2[i][j] = aleatorio2;
            }
        }

        System.out.println("-----Matriz2----- ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", matriz2[i][j]);
            }
            System.out.println();
        }

        System.out.println("-----------------");

        /*Añadimos las opciones a elegir con un Switch que nos redireciona a la funcion visualizarMatriz() que nos
        mostrara los resultados de todas las opciones separadas y resueltas en diferentes funciones*/
        char opcion;
        do {
            System.out.println("Introduce la opcion deseada:\n" +
                    "a) La suma de las dos matrices.\n" +
                    "b) El producto de la primera por un escalar.\n" +
                    "c) El producto de las dos matrices.\n" +
                    "d) La traspuesta de la segunda matriz.\n" +
                    "e) Finalizar programa.");

            opcion = br.readLine().toLowerCase().charAt(0);

            switch (opcion) {

                case 'a':
                    System.out.println("--La suma de las dos matrices--");
                    visualizarMatriz(opcion, numero, matriz, matriz2);
                    System.out.println("-----------------");
                    break;
                case 'b':
                    System.out.print("Introduce un numero entero para calcular el escalar: ");
                    numero = Integer.parseInt(br.readLine());
                    visualizarMatriz(opcion, numero, matriz, matriz2);
                    System.out.println("-----------------");
                    break;
                case 'c':
                    System.out.println("--El producto de las dos matrices--");
                    visualizarMatriz(opcion, numero, matriz, matriz2);
                    System.out.println("-----------------");
                    break;
                case 'd':
                    System.out.println("--La traspuesta de la segunda matriz--");
                    visualizarMatriz(opcion, numero, matriz, matriz2);
                    System.out.println("-----------------");
                    break;
                case 'e':
                    System.out.println("Programa finalizado.\n" +
                            "Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 'e');


    }

    private static void visualizarMatriz(char opcion, int numero, int[][] matriz, int[][] matriz2) {
        switch (opcion) {

            case 'a':
                suma(matriz, matriz2);
                break;
            case 'b':
                productoEscalar(matriz, numero);
                break;
            case 'c':
                producto(matriz, matriz2);
                break;
            case 'd':
                matriztraspuesta(matriz2);
                break;


        }
    }


    private static void matriztraspuesta(int[][] matriz2) {

        //matriztraspuesta() nos muestra digamos el modo inverso de una matriz, intercambiando [i] por [j].
        int[][] traspuesta = new int[4][4];

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                traspuesta[i][j] = matriz2[j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", traspuesta[i][j]);
            }
            System.out.println();
        }
    }

    private static void producto(int[][] matriz, int[][] matriz2) {

        //producto() nos muestra el resultado de la multiplicacion de los contenidos de ambas matrices.
        int[][] producto = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                producto[i][j] = matriz[i][j] * matriz2[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format(" %4d ", producto[i][j]);
            }
            System.out.println();
        }
    }

    private static void productoEscalar(int[][] matriz, int numero) {

        /*productoEscalar()nos muestra el resultado de multiplicar las casillas de la primera matriz por un numero
        pedido al usuario*/

        int[][] suma = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma[i][j] = matriz[i][j] * numero;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", suma[i][j]);
            }
            System.out.println();
        }
    }

    private static void suma(int[][] matriz, int[][] matriz2) {
        //Suma() nos muestra el resultado de sumar ambas matrices.
        int[][] suma = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.format("%4d", suma[i][j]);
            }
            System.out.println();
        }
    }


}
