package Libre;

import javax.swing.*;

/*
Ejercicio 9: Factorial de un número.
 */
public class Factorial {
        public static void main(String[] args) {
            // Programa para calcular el factorial de un número
            int n, factorial = 1, i = 1;

            // Solicitar el número
            n = Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:"));

            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
        }
}
