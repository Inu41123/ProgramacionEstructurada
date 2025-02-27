package Libre;

import javax.swing.*;

/*
Ejercicio 3: Suma de la serie 100 + 98 + 96 + ... + 0.
 */
public class Suma {
        public static void main(String[] args) {
            // Programa para calcular la suma de la serie 100 + 98 + 96 + ... + 0
            int suma = 0, numero = 100;

            while (numero >= 0) {
                suma += numero;
                numero -= 2;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de la serie es: " + suma);
        }
}
