package While;
import javax.swing.*;
/*
Ejercicio 5: Promedio de calificaciones de un grupo de alumnos.
 */
public class Alumnosgurpo {
        public static void main(String[] args) {
            // Programa para calcular el promedio de calificaciones de un grupo de n alumnos
            int n, i = 1;
            double calificacion, suma = 0, promedio;

            // Solicitar el número de alumnos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));

            while (i <= n) {
                // Solicitar la calificación del alumno

                calificacion = Double.parseDouble
                        (JOptionPane.showInputDialog
                        ("Ingrese la calificación del alumno " + i + ":"));
                suma += calificacion;

                i++;
            }

            // Calcular el promedio
            promedio = suma / n;

            // Mostrar el resultado
            JOptionPane.showMessageDialog
                    (null, "El promedio de calificaciones es: " + promedio);
        }
}
