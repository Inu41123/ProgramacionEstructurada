package EjerciciosUnidad1;

import javax.swing.*;

public class ResultadoExpresion {

        public static void main(String[] args) {

            // Declarar variables
            double Y = 0.0;
            double a = 3, b = 7, c = -15;
            double discriminante, X1, X2;

            // Pedir el valor de Y usando JOptionPane
            Y = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de Y:"));

            // Calculamos el discriminante
            discriminante = Math.pow(b, 2) - 4 * a * (c - Y); // Aquí usamos (c - Y) porque estamos resolviendo para Y

            // Verificar si el discriminante es negativo
            if (discriminante < 0) {
                JOptionPane.showMessageDialog(null, "La ecuación no tiene soluciones reales.");
            } else {
                // Calculamos las dos posibles soluciones para X
                X1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                X2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                // Mostrar las soluciones
                String salida = "Para Y = " + Y + ", las soluciones para X son:\n" +
                        "X1 = " + String.format("%.2f", X1) + "\n" +
                        "X2 = " + String.format("%.2f", X2);

                JOptionPane.showMessageDialog(null, salida);
            }
        }


}
