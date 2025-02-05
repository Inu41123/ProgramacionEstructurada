package EjerciciosUnidad1;

/*
Realizar un programa que calcule e imprima el promedio de cuatro calificaciones.R
 */

import javax.swing.*;

public class PromedioCalificaciones {

        public static void main(String[] args) {

            // Declarar variables para las calificaciones y el promedio
            double calificacion1 = 0.0;
            double calificacion2 = 0.0;
            double calificacion3 = 0.0;
            double calificacion4 = 0.0;
            double promedio = 0.0;

            // Pedir las calificaciones usando JOptionPane
            calificacion1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la primera calificación:"));
            calificacion2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la segunda calificación:"));
            calificacion3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tercera calificación:"));
            calificacion4 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuarta calificación:"));

            // Calcular el promedio
            promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;

            // Generar el mensaje de salida
            String salida = "Las calificaciones son:\n" +
                    "Calificación 1: " + String.format("%.2f", calificacion1) + "\n" +
                    "Calificación 2: " + String.format("%.2f", calificacion2) + "\n" +
                    "Calificación 3: " + String.format("%.2f", calificacion3) + "\n" +
                    "Calificación 4: " + String.format("%.2f", calificacion4) + "\n\n" +
                    "El promedio es: " + String.format("%.2f", promedio);

            // Mostrar el resultado con JOptionPane
            JOptionPane.showMessageDialog(null, salida);
        }
}
