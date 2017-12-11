package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Asignar variables.
        int fila;
        int columna;
        int numero;
        String continuar = null;
        String vacio = "*";

        //Introducir datos.
        String[][] sudoku = {
                {"5", "3", vacio, vacio, "7", vacio, vacio, vacio, vacio},
                {"6", vacio, vacio, "1", "9", "5", vacio, vacio, vacio},
                {vacio, "9", "8", vacio, vacio, vacio, vacio, "6", vacio},
                {"8", vacio, vacio, vacio, "6", vacio, vacio, vacio, "3"},
                {"4", vacio, vacio, "8", vacio, "3", vacio, vacio, "1"},
                {"7", vacio, vacio, vacio, "2", vacio, vacio, vacio, "6"},
                {vacio, "6", vacio, vacio, vacio, vacio, "2", "8", vacio},
                {vacio, vacio, vacio, "4", "1", "9", vacio, vacio, "5"},
                {vacio, vacio, vacio, vacio, "8", vacio, vacio, "7", "9"},
        };
        //Mostrar Sudoku inicial.
        sudoku(sudoku);

        do {

            //Insertar Coordenadas.

            System.out.println("Introduce fila (0-8): ");
            fila = Integer.parseInt(br.readLine());

            System.out.println("Introduce columna (0-8): ");
            columna = Integer.parseInt(br.readLine());

            if (sudoku[fila][columna] != vacio) {
                System.out.println("Coordenada en uso... Introduce una coordenada valida: ");
            } else {

                System.out.println("Introduce numero: ");
                numero = Integer.parseInt(br.readLine());
                sudoku[fila][columna] = String.valueOf(numero);
                sudoku(sudoku);
                System.out.println("Quieres continuar? (S/N) ");
                continuar = br.readLine().toLowerCase();
            }
            //Mostrar resultado final.


        } while (sudoku[fila][columna] != vacio || !continuar.equalsIgnoreCase("n"));
    }

    private static void sudoku(String[][] sudoku) {

        System.out.println("   |0|1|2|3|4|5|6|7|8|" + "\n______________________");
        System.out.println("0  |" + sudoku[0][0] + "|" + sudoku[0][1] + "|" + sudoku[0][2] + "|" + sudoku[0][3] + "|" + sudoku[0][4] + "|" + sudoku[0][5] + "|" + sudoku[0][6] + "|" + sudoku[0][7] + "|" + sudoku[0][8] + "|" + "\n----------------------");
        System.out.println("1  |" + sudoku[1][0] + "|" + sudoku[1][1] + "|" + sudoku[1][2] + "|" + sudoku[1][3] + "|" + sudoku[1][4] + "|" + sudoku[1][5] + "|" + sudoku[1][6] + "|" + sudoku[1][7] + "|" + sudoku[1][8] + "|" + "\n----------------------");
        System.out.println("2  |" + sudoku[2][0] + "|" + sudoku[2][1] + "|" + sudoku[2][2] + "|" + sudoku[2][3] + "|" + sudoku[2][4] + "|" + sudoku[2][5] + "|" + sudoku[2][6] + "|" + sudoku[2][7] + "|" + sudoku[2][8] + "|" + "\n----------------------");

        System.out.println("3  |" + sudoku[3][0] + "|" + sudoku[3][1] + "|" + sudoku[3][2] + "|" + sudoku[3][3] + "|" + sudoku[3][4] + "|" + sudoku[3][5] + "|" + sudoku[3][6] + "|" + sudoku[3][7] + "|" + sudoku[3][8] + "|" + "\n----------------------");
        System.out.println("4  |" + sudoku[4][0] + "|" + sudoku[4][1] + "|" + sudoku[4][2] + "|" + sudoku[4][3] + "|" + sudoku[4][4] + "|" + sudoku[4][5] + "|" + sudoku[4][6] + "|" + sudoku[4][7] + "|" + sudoku[4][8] + "|" + "\n----------------------");
        System.out.println("5  |" + sudoku[5][0] + "|" + sudoku[5][1] + "|" + sudoku[5][2] + "|" + sudoku[5][3] + "|" + sudoku[5][4] + "|" + sudoku[5][5] + "|" + sudoku[5][6] + "|" + sudoku[5][7] + "|" + sudoku[5][8] + "|" + "\n----------------------");

        System.out.println("6  |" + sudoku[6][0] + "|" + sudoku[6][1] + "|" + sudoku[6][2] + "|" + sudoku[6][3] + "|" + sudoku[6][4] + "|" + sudoku[6][5] + "|" + sudoku[6][6] + "|" + sudoku[6][7] + "|" + sudoku[6][8] + "|" + "\n----------------------");
        System.out.println("7  |" + sudoku[7][0] + "|" + sudoku[7][1] + "|" + sudoku[7][2] + "|" + sudoku[7][3] + "|" + sudoku[7][4] + "|" + sudoku[7][5] + "|" + sudoku[7][6] + "|" + sudoku[7][7] + "|" + sudoku[7][8] + "|" + "\n----------------------");
        System.out.println("8  |" + sudoku[8][0] + "|" + sudoku[8][1] + "|" + sudoku[8][2] + "|" + sudoku[8][3] + "|" + sudoku[8][4] + "|" + sudoku[8][5] + "|" + sudoku[8][6] + "|" + sudoku[8][7] + "|" + sudoku[8][8] + "|" + "\n----------------------");

    }
}


