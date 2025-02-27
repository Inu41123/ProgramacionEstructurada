package Libre;

import javax.swing.*;

public class Suceccion2 {
        public static void main(String[] args) {
            // Programa para calcular la suma de la sucesión 1, 4, 9, 16, ..., n
            int n, suma = 0, i = 1;
            String input;

            // Solicitar el valor de n
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));

            while (i * i <= n) {
                suma += i * i;
                i++;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de la sucesión es: " + suma);
        }
}
