package Libre;

import javax.swing.*;

/*
Ejercicio 8: Suma de los números del 1 al 100.
 */
public class SumaNumeros {
        public static void main(String[] args) {
            // Programa para calcular la suma de los números del 1 al 100
            int suma = 0, i = 1;

            while (i <= 100) {
                suma += i;
                i++;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de los números del 1 al 100 es: " + suma);
        }
}
