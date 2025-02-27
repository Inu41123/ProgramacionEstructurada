package For;

/*
Ejercicio 2: Calcular la calificación media y
la calificación más baja de un grupo de n alumnos.
 */


import javax.swing.*;

public class Califgrupo {
        public static void main(String[] args) {
            // Programa para calcular la calificación media y la más baja de un grupo de n alumnos
            int n;
            double suma = 0, calificacion, media, minima = Double.MAX_VALUE;

            // Solicitar el número de alumnos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));

            // Solicitar las calificaciones
            for (int i = 1; i <= n; i++) {
                calificacion = Double.parseDouble(JOptionPane.showInputDialog
                        ("Ingrese la calificación del alumno " + i + ":"));
                suma += calificacion;
                if (calificacion < minima) {
                    minima = calificacion;
                }
            }

            // Calcular la media
            media = suma / n;

            // Mostrar los resultados
            String resultado =
                    "La calificación media es: " + media + "\nLa calificación más baja es: " + minima;
            JOptionPane.showMessageDialog(null, resultado);

    }

}
