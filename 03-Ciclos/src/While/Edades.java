package While;

import javax.swing.*;

/*
Ejercicio 6: Promedio de edades de hombres, mujeres y de un grupo
 */
public class Edades {
        public static void main(String[] args) {
            // Programa para calcular el promedio de edades de hombres, mujeres y de todo un grupo
            int n, i = 1, edad, hombres = 0, mujeres = 0;
            double sumaHombres = 0, sumaMujeres = 0, sumaTotal = 0;
            String genero;

            // Solicitar el número de alumnos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de alumnos:"));

            while (i <= n) {
                // Solicitar el género y la edad del alumno
                genero = JOptionPane.showInputDialog("Ingrese el género del alumno " + i + " (H/M):").toUpperCase();
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno " + i + ":"));

                if (genero.equals("H")) {
                    sumaHombres += edad;
                    hombres++;
                } else if (genero.equals("M")) {
                    sumaMujeres += edad;
                    mujeres++;
                }

                sumaTotal += edad;
                i++;
            }

            // Calcular los promedios
            double promedioHombres = hombres > 0 ? sumaHombres / hombres : 0;
            double promedioMujeres = mujeres > 0 ? sumaMujeres / mujeres : 0;
            double promedioTotal = n > 0 ? sumaTotal / n : 0;

            // Mostrar los resultados
            String resultado = "Promedio de edades de hombres: " + promedioHombres + "\n" +
                    "Promedio de edades de mujeres: " + promedioMujeres + "\n" +
                    "Promedio de edades de todo el grupo: " + promedioTotal;
            JOptionPane.showMessageDialog(null, resultado);
        }
}
