package Libre;

import javax.swing.*;

/*
Ejercicio 11: Suma de los números que anteceden a un número.
 */
public class Suma2 {
        public static void main(String[] args) {
            // Programa para calcular la suma de los números que anteceden a un número
            int n, suma = 0, i = 1;
            String input;

            // Solicitar el número
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

            while (i < n) {
                suma += i;
                i++;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de los números que anteceden a " + n + " es: " + suma);
        }
}
