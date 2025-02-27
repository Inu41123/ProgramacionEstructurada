package For;

/*
Ejercicio 1: Calcular el promedio de un alumno que tiene n
calificaciones en la materia de Metodología de la programación.
 */

import javax.swing.*;
public class Promedio {

        public static void main(String[] args) {
            // Programa para calcular el promedio de n calificaciones de un alumno
            int n;
            double suma = 0, promedio;

            // Solicitar el número de calificaciones
            n = Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese el número de calificaciones:"));

            // Solicitar las calificaciones
            for (int i = 1; i <= n; i++) {
                suma += Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese la calificación " + i + ":"));
            }

            // Calcular el promedio
            promedio = suma / n;

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + promedio);
        }
}
