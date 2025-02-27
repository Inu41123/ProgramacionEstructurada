package While;

import javax.swing.*;

/*
Ejercicio 2: Salario semanal de obreros.

 */
public class Obreros {

        public static void main(String[] args) {
            // Programa para calcular el salario semanal de n obreros
            int n, i = 1, horas;
            double salario;

            // Solicitar el número de obreros
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de obreros:"));

            while (i <= n) {
                // Solicitar las horas trabajadas por el obrero
                horas = Integer.parseInt(JOptionPane.showInputDialog
                        ("Ingrese las horas trabajadas por el obrero " + i + ":"));

                // Calcular el salario
                if (horas <= 40) {
                    salario = horas * 20;
                } else {
                    salario = 40 * 20 + (horas - 40) * 25;
                }

                // Mostrar el salario
                JOptionPane.showMessageDialog(null, "El salario del obrero " + i + " es: $" + salario);

                i++;
            }
        }
    }
