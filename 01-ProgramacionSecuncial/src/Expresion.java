/*

Calcular el resultado de la expresion n = x+y/y-1
para los valores de x y y cualesquiera

 */

import javax.swing.*;

public class Expresion {

    public static void main(String[] args) {

        //Declarar variables

        double x = 0.0;
        double y = 0.0;
        double n = 0.0;
        String salida = "";

        //pedir datos
        x = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de a"));
        y = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de y"));

        //Calcular la expresion
        n = (x + y) / (y - 1);

        //Salida
        salida = "El resultado de la expresion (x + y) / (y - 1) " + "\n" +
                " usando: "+ x + " y " + y + "\n" +
                " El resultado es: " + String.format("%.2f",n);

        JOptionPane.showMessageDialog(null,salida);


        /*
        // Definir los valores de X y Y
        double X = 5, Y = 3;

        // Calcular la expresión
        double N = (X + Y) / (Y - 1);

        // Mostrar el resultado
        System.out.println("El valor de N es: " + N);
*/


    }

}
