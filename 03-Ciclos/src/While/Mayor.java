package While;

import javax.swing.*;

/*
Ejercicio 8: Encontrar el mayor valor de un conjunto de n números.
 */
public class Mayor {
        public static void main(String[] args) {
            // Programa para encontrar el mayor valor de un conjunto de n números
            int n, i = 1;
            double numero, mayor = Double.MIN_VALUE;

            // Solicitar el número de elementos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos:"));

            while (i <= n) {
                // Solicitar el número
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

                if (numero > mayor) {
                    mayor = numero;
                }

                i++;
            }

            // Mostrar el mayor valor
            JOptionPane.showMessageDialog(null, "El mayor valor es: " + mayor);
        }
}
