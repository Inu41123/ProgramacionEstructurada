package Libre;
import javax.swing.*;

/*
Ejercicio 5: Suma de la sucesión 20, 25, 30, 35, ..., N.
 */
public class Succesiom {
        public static void main(String[] args) {
            // Programa para calcular la suma de la sucesión 20, 25, 30, 35, ..., N
            int n, suma = 0, numero = 20;

            // Solicitar el valor de N
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N:"));

            while (numero <= n) {
                suma += numero;
                numero += 5;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "La suma de la sucesión es: " + suma);
        }
}
