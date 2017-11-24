package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Realizar un programa que cuente el número de veces que aparece cada una de las letras del alfabeto en un texto introducido por el usuario.

                El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en la posición correspondiente de un array.

                Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().

                Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Escribimos el texto y recogemos el resultado a la funcion contarLetras().
        System.out.println("Escribe un texto: ");
        String texto = br.readLine().toLowerCase();
        contarLetras(texto);

    }


    private static void contarLetras(String texto) {
        //Desglosamos la variable texto dentro del toCharArray y recogemos el resultado a la funcion visualizarRecuento.
        char[] Letra = texto.toCharArray();

        for (int i = 0; i < Letra.length; i++) {
            System.out.println(i + " " + Letra[i]);
        }

        visualizarRecuento(Letra);
    }

    private static void visualizarRecuento(char[] letra) {
        //Creamos las variables del recuento de las letras que se repiten.
        int recuentoA = 0;
        int recuentoB = 0;
        int recuentoC = 0;
        int recuentoD = 0;
        //Contamos la cantidad de veces de cada letra que se repite con el for y despues lo enseñamos por pantalla.
        for (int i = 0; i < letra.length; i++) {

            if (letra[i] == 'a') {
                recuentoA++;
            }
            if (letra[i] == 'b') {
                recuentoB++;
            }
            if (letra[i] == 'c') {
                recuentoC++;
            }
            if (letra[i] == 'd') {
                recuentoD++;
            }
        }
        System.out.println("La letra 'A' se repite " + recuentoA + " veces.");
        System.out.println("La letra 'B' se repite " + recuentoB + " veces.");
        System.out.println("La letra 'C' se repite " + recuentoC + " veces.");
        System.out.println("La letra 'D' se repite " + recuentoD + " veces.");


    }


}

