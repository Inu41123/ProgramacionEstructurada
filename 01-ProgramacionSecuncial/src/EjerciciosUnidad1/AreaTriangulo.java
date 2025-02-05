package EjerciciosUnidad1;

/*
Realizar un programa que calcule e imprima el área de un triangulo
 */

import javax.swing.*;

public class AreaTriangulo {

        public static void main(String[] args) {

            // Declarar variables
            double base = 0.0;
            double altura = 0.0;
            double area = 0.0;

            // Pedir datos con JOptionPane
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del triángulo (en unidades):"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del triángulo (en unidades):"));

            // Calcular el área
            area = (base * altura) / 2;

            // Mostrar el resultado con JOptionPane
            String salida = "El triángulo con base " + String.format("%.2f", base) + " unidades\n" +
                    "y altura " + String.format("%.2f", altura) + " unidades\n" +
                    "tiene un área de: " + String.format("%.2f", area) + " unidades cuadradas.";

            // Mostrar el mensaje en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, salida);
        }
}
