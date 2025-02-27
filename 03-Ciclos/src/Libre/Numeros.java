package Libre;

import javax.swing.*;

/*
Ejercicio 16: Imprimir números del 1000 al 0.
 */
public class Numeros {
        public static void main(String[] args) {
            // Programa para imprimir los números del 1000 al 0
            int i = 1000;
            String resultado = "";

            while (i >= 0) {
                resultado += i + " ";
                i--;
            }

            // Mostrar los números
            JOptionPane.showMessageDialog
                    (null, "Números del 1000 al 0:\n" + resultado);
        }
}
