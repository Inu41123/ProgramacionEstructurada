package Libre;

import javax.swing.*;

/*
Ejercicio 4: Porcentaje de aprobados y reprobados.
 */
public class AprobadosyReprobados {
        public static void main(String[] args) {
            // Programa para calcular el porcentaje de aprobados y reprobados
            int n, i = 1, aprobados = 0, reprobados = 0;
            double calificacion;
            String input;

            // Solicitar el número de alumnos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));

            while (i <= n) {
                // Solicitar la calificación de cada alumno
                calificacion = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese la calificación del alumno " + i + ":"));

                if (calificacion >= 70) {
                    aprobados++;
                } else {
                    reprobados++;
                }

                i++;
            }

            // Calcular los porcentajes
            double porcentajeAprobados = (aprobados * 100.0) / n;
            double porcentajeReprobados = (reprobados * 100.0) / n;

            // Mostrar los resultados
            String resultado = "Porcentaje de aprobados: " + porcentajeAprobados + "%\n" +
                    "Porcentaje de reprobados: " + porcentajeReprobados + "%";
            JOptionPane.showMessageDialog(null, resultado);
        }
}
