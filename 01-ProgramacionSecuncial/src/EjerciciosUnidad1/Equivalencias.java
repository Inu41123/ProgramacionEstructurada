package EjerciciosUnidad1;

/*
 Hacer un programa que lea un número en pies y calcule e imprima su equivalente en
yardas, pulgadas, centímetros y metros, de acuerdo con las siguientes equivalencias: 1
pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm
 */

import javax.swing.*;

public class Equivalencias {

        public static void main(String[] args) {

            // Declarar la variable para la longitud en pies
            double pies = 0.0;
            double yardas, pulgadas, centimetros, metros;
            String salida = "";


            // Pedir al usuario que ingrese la longitud en pies
            pies = Double.parseDouble(JOptionPane.showInputDialog("Introduce la longitud en pies:"));

            // Realizar las conversiones
            yardas = pies / 3.0; // 1 yarda = 3 pies
            pulgadas = pies * 12.0; // 1 pie = 12 pulgadas
            centimetros = pulgadas * 2.54; // 1 pulgada = 2.54 cm
            metros = centimetros / 100.0; // 1 metro = 100 cm

            // Mostrar el resultado
            salida = pies + " pies equivalen a:\n" +
                    String.format("%.2f", yardas) + " yardas\n" +
                    String.format("%.2f", pulgadas) + " pulgadas\n" +
                    String.format("%.2f", centimetros) + " centímetros\n" +
                    String.format("%.2f", metros) + " metros";

            // Mostrar el mensaje con JOptionPane
            JOptionPane.showMessageDialog(null, salida);
        }
}
