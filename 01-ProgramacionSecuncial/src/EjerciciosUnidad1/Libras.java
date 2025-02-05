package EjerciciosUnidad1;

import javax.swing.*;
/***

 Escribir un programa que convierta tres numeros de
 kilogramosw a libras (1 libra = 0.454)


 */
public class Libras {

        public static void main(String[] args) {

            //Declaracion de CONSTANTES
            final double FACTOR_CONVERSION = 0.454;

            //Declaracion de variables de tres numeros dobles a convertir

            double kg1 = 0.0;
            double kg2 = 0.0;
            double kg3 = 0.0;

            String salida = "";



            //Solicitar los 3 numeros a calcular
            kg1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de el primer Kg"));
            kg2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de el segundo Kg"));
            kg3 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de el tercer Kg"));


            //salida o resultados de las operacion         la f quiere indicar . flotnate
            salida = kg1 + "Kg" + " en Libras es: " + String.format("%.2f", kg1 / FACTOR_CONVERSION) + "\n" +
                    kg2 + " Kg" + "en Libras es: " + String.format("%.2f", kg2 / FACTOR_CONVERSION) + "\n" +
                    kg3 + " Kg" + " en Libras es: " + String.format("%.2f", kg3 / FACTOR_CONVERSION);

            JOptionPane.showMessageDialog(null, salida);



        /* Conversión a libras (1 kg = 0.454 libras)
        double libra1 = kg1 * 0.454;
        double libra2 = kg2 * 0.454;
        double libra3 = kg3 * 0.454;

        Mostrar los resultados
        System.out.println("10 kg son: " + libra1 + " libras.");
        System.out.println("50 kg son: " + libra2 + " libras.");
        System.out.println("100 kg son: " + libra3 + " libras.");
             */

        }


}
