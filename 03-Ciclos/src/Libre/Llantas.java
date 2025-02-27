package Libre;

import javax.swing.*;

/*
Ejercicio 1: Promedio de masa de aire en neumáticos.
*/
public class Llantas {
        public static void main(String[] args) {
            // Programa para calcular el promedio de masa de aire en neumáticos de n vehículos
            int n, i = 1;
            double presion, volumen, temperatura, masa, sumaMasa = 0, promedioMasa;

            // Solicitar el número de vehículos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos:"));

            while (i <= n) {
                // Solicitar los datos de cada vehículo
                presion = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese la presión " +
                                "del neumático del vehículo " + i + ":"));

                volumen = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese el volumen " +
                                "del neumático del vehículo " + i + ":"));

                temperatura = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese la temperatura " +
                                "del neumático del vehículo " + i + ":"));

                // Calcular la masa de aire
                masa = (presion * volumen) / (0.37 * (temperatura + 460));
                sumaMasa += masa;

                i++;
            }

            // Calcular el promedio de masa de aire
            promedioMasa = sumaMasa / n;

            // Mostrar el resultado
            JOptionPane.showMessageDialog
                    (null, "El promedio de masa de aire es: " + promedioMasa);
        }
}
