package Libre;

import javax.swing.*;

/*
Ejercicio 13: Sumar los números positivos y multiplicar los negativos.
 */
public class PositivosyNegativos {
        public static void main(String[] args) {
            // Programa para sumar los números positivos y multiplicar los negativos
            int n, i = 1;
            double numero, sumaPositivos = 0, multiplicacionNegativos = 1;

            // Solicitar el número de elementos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos:"));

            while (i <= n) {
                // Solicitar el número
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

                if (numero > 0) {
                    sumaPositivos += numero;
                } else if (numero < 0) {
                    multiplicacionNegativos *= numero;
                }

                i++;
            }

            // Mostrar los resultados
            String resultado = "Suma de los números positivos: " + sumaPositivos + "\n" +
                    "Multiplicación de los números negativos: " + multiplicacionNegativos;
            JOptionPane.showMessageDialog(null, resultado);
        }
}
