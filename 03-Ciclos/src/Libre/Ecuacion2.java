package Libre;

import javax.swing.*;

/*
 Programa para resolver la serie S = x^(3/3)/1 + x^(3/6)/3 - x^(3/9)/5 + x^(3/12)/7 - ... n
 */
public class Ecuacion2 {
        public static void main(String[] args) {
            // Programa para resolver la serie S = x^(3/3)/1 + x^(3/6)/3 - x^(3/9)/5 + x^(3/12)/7 - ... n
            int n, i = 1;
            double x, termino, suma = 0;

            // Solicitar el valor de x
            x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de x:"));

            // Solicitar el número de términos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de términos:"));

            while (i <= n) {
                termino = Math.pow(x, 3.0 / (3 * i)) / (2 * i - 1);
                if (i % 2 == 0) {
                    suma -= termino;
                } else {
                    suma += termino;
                }
                i++;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de la serie es: " + suma);
        }
}
