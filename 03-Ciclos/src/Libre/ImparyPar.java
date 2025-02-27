package Libre;

/*
Ejercicio 10: Números impares entre 0 y 100.
 */

import javax.swing.*;

public class ImparyPar {
        public static void main(String[] args) {
            // Programa para mostrar los números impares entre 0 y 100
            int i = 1;
            String resultado = "";

            while (i <= 100) {
                if (i % 2 != 0) {
                    resultado += i + " ";
                }
                i++;
            }

            // Mostrar los números impares
            JOptionPane.showMessageDialog(null, "Números impares entre 0 y 100:\n" + resultado);
        }
}
