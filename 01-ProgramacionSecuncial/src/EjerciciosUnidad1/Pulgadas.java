package EjerciciosUnidad1;


/*
Escribir un programa que convierte los 2, 5 y 10 pulgadas a milímetros (1 pulgada =
25,4 mm).
 */

import javax.swing.*;

public class Pulgadas {

    public static void main(String[] args) {

        //Declaracion de CONSTANTES
        final double FACTOR_CONVERSION = 25.4;

        //Declaracion de variables de tres numeros dobles a convertir

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;

        String salida = "";

        //Solicitar los 3 numeros a calcular
        p1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de la primer pulgada"));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de la segunda pulgada"));
        p3 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de la tercera pulgada"));


        //salida o resultados de las operacion         la f quiere indicar . flotnate
        salida = p1 + "Pulgadas" + " en Milimetros es: " + String.format("%.2f", p1 / FACTOR_CONVERSION) + "\n" +
                p2 + " Pulgadas" + "en Milimetros es: " + String.format("%.2f", p2 / FACTOR_CONVERSION) + "\n" +
                p3 + " Pulgadas" + " en Milimetros es: " + String.format("%.2f", p3 / FACTOR_CONVERSION);

        JOptionPane.showMessageDialog(null, salida);

    }

}
