package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String escribe;
        String continuar;
        char sino;
        int correcto = 0;
        int incorrecto = 0;
        

        String pregunta[] = {
                "¿Cuál océano se encuentra en la costa este de los Estados Unidos?",
                "Autor de 'El arte de la guerra'?",
                "¿En que año descubrió Colón América?",
                "Nombre de la niña que visitó “El País de las Maravillas”, en el cuento del mismo nombre?",
                "¿Cómo se llama a la ciencia que estudia los fósiles?",
        };

        String respuesta[] = {
                "atlantico",
                "Sun Tzu",
                "1492",
                "alicia",
                "Paleontología",
        };

        System.out.println("Responde a las preguntas o termina escribiendo 'fin': ");

        do {
            Random r = new Random();
            int aleatorio = r.nextInt(4);

            System.out.println(pregunta[aleatorio]);
            escribe = br.readLine();
            System.out.println("La respuesta correcta es: " + respuesta[aleatorio]);
            System.out.println("La respuesta que has puesto es correcta? si/no ");
            sino = br.readLine().toLowerCase().charAt(0);

            if (sino == 's' ) {
                correcto += 1;
            } else {
                incorrecto += 1;
            }

            System.out.println("Quieres continuar? si/no");
            continuar = br.readLine().toLowerCase();

        } while (!continuar.equalsIgnoreCase("no"));

        System.out.println("El numero de respuesta correctas es: " + correcto);
        System.out.println("El numero de respuesta incorrectas es: " + incorrecto);
    }
}

