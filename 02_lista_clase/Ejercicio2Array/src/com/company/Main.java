package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /* Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.

       Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.

       Nota: El programa termina cuando se escriba FIN como búsqueda.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Cantidad de datos que quieres guardar en el array.

        String letra;
        String nombre = null;

        System.out.println("Introduce la cantidad de alumnos que quieres registrar: ");
        int a = Integer.parseInt(br.readLine());

        String[] alumno = new String[a];


        //Se visualiza y se Inicializa el array y se piden los datos.
        for (int i = 0; i < alumno.length; i++) {

            System.out.println("Inserta un nombre y apellido");
            nombre = br.readLine();
            alumno[i] = nombre;
        }
        //Muestra alumnos.
        System.out.println("Los datos introducidos son los siguientes: ");
        for (int i = 0; i < alumno.length; i++) {
            System.out.println(alumno[i]);
        }

        do {
            System.out.println("Escribe una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra: ");
            letra= br.readLine();

            if (letra.equalsIgnoreCase("FIN"))
            {
                System.out.println("Fin del programa: ");
            }
            for (int i = 0; i <alumno.length; i++) {

            if (alumno[i].substring(0,1).equalsIgnoreCase(String.valueOf(letra))){
                System.out.println("Los nombres que empiezan por la letra "+letra+" son: ");
                System.out.println(alumno[i]);}
            }

        } while (!letra.equalsIgnoreCase("FIN"));
    }
}
