package Libre;

import javax.swing.*;

/*
Ejercicio 7: Número mayor y menor de un conjunto.
 */
public class MayroMenor {
        public static void main(String[] args) {
            // Programa para encontrar el número mayor y menor de un conjunto de n números
            int n, i = 1;
            double numero, mayor = Double.MIN_VALUE, menor = Double.MAX_VALUE;

            // Solicitar el número de elementos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos:"));

            while (i <= n) {
                // Solicitar el número
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));

                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                i++;
            }

            // Mostrar los resultados
            String resultado = "El número mayor es: " + mayor + "\n" +
                    "El número menor es: " + menor;
            JOptionPane.showMessageDialog(null, resultado);
        }
}
