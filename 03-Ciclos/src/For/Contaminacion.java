package For;
import javax.swing.*;


/*
Ejercicio 6: Promedio de puntos contaminantes de los primeros 25 automóviles.
 */

public class Contaminacion {
        public static void main(String[] args) {
            // Programa para calcular el promedio de puntos contaminantes de los primeros 25 automóviles
            int n = 25;
            double puntos, suma = 0, promedio, minima = Double.MAX_VALUE, maxima = Double.MIN_VALUE;
            String input;

            // Solicitar los puntos contaminantes de cada automóvil
            for (int i = 1; i <= n; i++) {
                puntos = Double.parseDouble(JOptionPane.showInputDialog
                        ("Ingrese los puntos contaminantes del automóvil " + i + ":"));
                suma += puntos;

                if (puntos < minima) {
                    minima = puntos;
                }
                if (puntos > maxima) {
                    maxima = puntos;
                }
            }

            // Calcular el promedio
            promedio = suma / n;

            // Mostrar los resultados
            String resultado = "El promedio de puntos contaminantes es: " + promedio + "\n" +
                    "El automóvil que menos contaminó tiene: " + minima + " puntos\n" +
                    "El automóvil que más contaminó tiene: " + maxima + " puntos";
            JOptionPane.showMessageDialog(null, resultado);
        }
}
