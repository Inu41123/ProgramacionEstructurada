package While;

import javax.swing.*;

/*
Ejercicio 7: Encontrar el menor valor de un conjunto de n números.
 */
public class Numeros {
        public static void main(String[] args) {
            // Programa para encontrar el menor valor de un conjunto de n números
            int n, i = 1;
            double numero, menor = Double.MAX_VALUE;
            String input;

            // Solicitar el número de elementos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos:"));

            while (i <= n) {
                // Solicitar el número
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

                if (numero < menor) {
                    menor = numero;
                }

                i++;
            }

            // Mostrar el menor valor
            JOptionPane.showMessageDialog(null, "El menor valor es: " + menor);
        }
}
