package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] TABLERO= new char[3][3];

        char JUGADOR1 = 'O';
        char JUGADOR2 = 'X';

        int filaJ1;
        int columnaJ1;
        int filaJ2;
        int columnaJ2;

        for (filaJ1 = 0; filaJ1 < 3; filaJ1++) {
            for (columnaJ1 = 0; columnaJ1 < 3; columnaJ1++) {
                TABLERO[filaJ1][columnaJ1] = ' ';
            }
        }
        for (filaJ2 = 0; filaJ2 < 3; filaJ2++) {
            for (columnaJ2 = 0; columnaJ2 < 3; columnaJ2++) {
                TABLERO[filaJ2][columnaJ2] = ' ';
            }
        }
        visualizartablero(TABLERO);
        do {

            //JUGADOR 1:
            System.out.print("Jugador 1 selecciona fila: ");
            filaJ1 = Integer.parseInt(br.readLine());
            System.out.print("Jugador 1 selecciona columna: ");
            columnaJ1 = Integer.parseInt(br.readLine());
            TABLERO[filaJ1][columnaJ1] = JUGADOR1;
            visualizartablero(TABLERO);

            //JUGADOR 2:
            System.out.print("Jugador 2 selecciona fila: ");
            filaJ2 = Integer.parseInt(br.readLine());
            System.out.print("Jugador 2 selecciona columna: ");
            columnaJ2 = Integer.parseInt(br.readLine());
            TABLERO[filaJ2][columnaJ2] = JUGADOR2;
            visualizartablero(TABLERO);
        }
        while ( comprobarGanador(TABLERO, JUGADOR1, JUGADOR2) != true);
    }

    private static void visualizartablero(char[][] TABLERO) {
        System.out.println(" | 0 | 1 | 2 |" + "\n--------------");
        System.out.println("0| " + TABLERO[0][0] + " | " + TABLERO[0][1] + " | " + TABLERO[0][2] + " |" + "\n--------------");
        System.out.println("1| " + TABLERO[1][0] + " | " + TABLERO[1][1] + " | " + TABLERO[1][2] + " |" + "\n--------------");
        System.out.println("2| " + TABLERO[2][0] + " | " + TABLERO[2][1] + " | " + TABLERO[2][2] + " |" + "\n--------------");
    }

    private static boolean comprobarGanador(char[][] TABLERO, char JUGADOR1, char JUGADOR2) {

        boolean ganador = false;

        //Condiciones de victoria jugador 1.
        if ((TABLERO[0][0] == JUGADOR1) && (TABLERO[0][1] == JUGADOR1) && (TABLERO[0][2] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[1][0] == JUGADOR1) && (TABLERO[1][1] == JUGADOR1) && (TABLERO[1][2] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[2][0] == JUGADOR1) && (TABLERO[2][1] == JUGADOR1) && (TABLERO[2][2] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[0][0] == JUGADOR1) && (TABLERO[1][1] == JUGADOR1) && (TABLERO[2][2] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[0][2] == JUGADOR1) && (TABLERO[1][1] == JUGADOR1) && (TABLERO[2][0] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[0][0] == JUGADOR1) && (TABLERO[1][0] == JUGADOR1) && (TABLERO[2][0] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[0][1] == JUGADOR1) && (TABLERO[1][1] == JUGADOR1) && (TABLERO[2][1] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }
        if ((TABLERO[0][2] == JUGADOR1) && (TABLERO[1][2] == JUGADOR1) && (TABLERO[2][2] == JUGADOR1)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 1");
        }

        //Condiciones de victoria jugador 2.
        if ((TABLERO[0][0] == JUGADOR2) && (TABLERO[0][1] == JUGADOR2) && (TABLERO[0][2] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[1][0] == JUGADOR2) && (TABLERO[1][1] == JUGADOR2) && (TABLERO[1][2] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[2][0] == JUGADOR2) && (TABLERO[2][1] == JUGADOR2) && (TABLERO[2][2] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[0][0] == JUGADOR2) && (TABLERO[1][1] == JUGADOR2) && (TABLERO[2][2] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[0][2] == JUGADOR2) && (TABLERO[1][1] == JUGADOR2) && (TABLERO[2][0] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[0][0] == JUGADOR2) && (TABLERO[1][0] == JUGADOR2) && (TABLERO[2][0] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[0][1] == JUGADOR2) && (TABLERO[1][1] == JUGADOR2) && (TABLERO[2][1] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }
        if ((TABLERO[0][2] == JUGADOR2) && (TABLERO[1][2] == JUGADOR2) && (TABLERO[2][2] == JUGADOR2)) {
            ganador = true;
            System.out.println("Ha ganado el jugador 2");
        }

        return ganador;
    }
}

