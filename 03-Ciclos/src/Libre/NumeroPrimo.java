package Libre;

import javax.swing.*;

/*
Ejercicio 12: Determinar si un número es primo.
 */
public class NumeroPrimo {
        public static void main(String[] args) {
            // Programa para determinar si un número es primo
            int n, i = 2;
            boolean esPrimo = true;

            // Solicitar el número
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

            while (i <= n / 2) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
                i++;
            }

            // Mostrar el resultado
            if (esPrimo && n > 1) {
                JOptionPane.showMessageDialog(null, n + " es un número primo.");
            } else {
                JOptionPane.showMessageDialog(null, n + " no es un número primo.");
            }
        }
}
