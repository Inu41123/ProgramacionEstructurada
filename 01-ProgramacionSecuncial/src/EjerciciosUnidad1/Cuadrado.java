package EjerciciosUnidad1;

/*
Escribir un programa que calcula y muestra el cuadrado de cada entero
1-9.
 */

import javax.swing.*;

public class Cuadrado {

        public static void main(String[] args) {

        //declaracion de variables
            double e1 = 1, e2 = 2, e3 = 3, e4 = 4, e5 = 5, e6 = 6, e7 = 7, e8 = 8, e9 = 9;
            String salida = "";

            //declarar salida
            salida = "el cuadrado de 1 es: " + e1 + "\n" +
                    "el cuadrado de 2 es: " + e2 + "\n" +
                    "el cuadrado de 3 es: " + e3 + "\n" +
                    "el cuadrado de 4 es: " + e4 + "\n" +
                    "el cuadrado de 5 es: " + e5 + "\n" +
                    "el cuadrado de 6 es: " + e6 + "\n" +
                    "el cuadrado de 7 es: " + e7 + "\n" +
                    "el cuadrado de 8 es: " + e8 + "\n" +
                    "el cuadrado de 9 es: " + e9 + "\n";


            // Muestra el número y su cuadrado
            JOptionPane.showMessageDialog(null, salida);

        }
}
