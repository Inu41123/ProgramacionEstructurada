package Libre;

import javax.swing.*;

/*
Ejercicio 2: Precio de venta por kilo de huevo.
 */
public class huevo {
        public static void main(String[] args) {
            // Programa para determinar el precio de venta por kilo de huevo en una granja
            int n, i = 1;
            double peso, altura, huevos, calidad, sumaCalidad = 0, promedioCalidad, precioKilo;

            // Solicitar el número de gallinas
            n = Integer.parseInt
                    (JOptionPane.showInputDialog("Ingrese el número de gallinas:"));

            while (i <= n) {
                // Solicitar los datos de cada gallina
                peso = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese el peso de la gallina " + i + ":"));

                altura = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese la altura de la gallina " + i + ":"));

                huevos = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese el número de huevos " +
                                "que pone la gallina " + i + ":"));

                // Calcular la calidad de la gallina
                calidad = (peso * altura) / huevos;
                sumaCalidad += calidad;

                i++;
            }

            // Calcular el promedio de calidad
            promedioCalidad = sumaCalidad / n;

            // Determinar el precio por kilo de huevo
            if (promedioCalidad >= 15) {
                precioKilo = 1.2 * promedioCalidad;
            } else if (promedioCalidad > 8 && promedioCalidad < 15) {
                precioKilo = 1.00 * promedioCalidad;
            } else {
                precioKilo = 0.80 * promedioCalidad;
            }

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "El precio por kilo de huevo es: $" + precioKilo);
        }
}
