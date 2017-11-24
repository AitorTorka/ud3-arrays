package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        /* Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.

        Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

        Visualiza la información en forma de gráfico de barras. Por ejemplo:]*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double maximo = Integer.MIN_VALUE;
        double minimo = Integer.MAX_VALUE;
        double temperatura = 0;
        double media = 0;
        final int n = 3;

        //Creamos el array con una anchura de 5 celdas.
        double[] arraytemp;
        arraytemp = new double[n];

        //Inicializamos el array a 0 e insertamos datos.
        for (int i = 0; i < arraytemp.length; i++) {

            //Insertamos los 3 datos.

            System.out.println("Inserta 3 temperaturas: ");
            temperatura = Double.parseDouble(br.readLine());

            if (temperatura > maximo) {
                maximo = temperatura;
            }
            if (temperatura < minimo) {
                minimo = temperatura;
            }
            media += temperatura / 3;

            arraytemp[i] = temperatura;
        }

        //visualizamos los datos del array.



        for (int i = 0; i < arraytemp.length; i++) {
            System.out.print(i+" ");

            for ( int j = 0; j < arraytemp[i]; j++) {
                System.out.print("*");}

            if (!(arraytemp[i] == maximo || arraytemp[i] == minimo)) {
                System.out.println(arraytemp[i]);
            }

            if (arraytemp[i] == minimo) {
                System.out.println(arraytemp[i]+" <---Min");
            }

            if (arraytemp[i] == maximo) {
                System.out.println(arraytemp[i]+" <---Max");
            }
        }

        System.out.println("La Temperatura media es : " + media);
        System.out.println("La temperatura maxima es : " + maximo);
        System.out.println("La temperatura minima es : " + minimo);

    }
}


    /*    0  ***************  15.0
        1  ***************  15.2
        2  ***************  15.1
        3  ***************  15.2
        4  ***************  15.1
        5  ***************  15.1
        6  **************  14.9  --> MIN
        7  ****************  16.1
        8  ****************  16.5
        9  *****************  17.2
        10  *******************  19.5
        11  ********************  20.0
        12  **********************  22.1
        13  ***********************  23.3
        14  *************************  25.2
        15  **************************  26.3  --> MAX
        16  *************************  25.9
        17  *************************  25.8
        18  ************************  24.2
        19  ************************  24.1
        20  ********************  20.7
        21  *******************  19.6
        22  *****************  17.3
        23  ****************  16.5
        Media: 19.4*/