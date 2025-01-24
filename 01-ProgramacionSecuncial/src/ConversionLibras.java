import javax.swing.*;

/***

 Escribir un programa que convierta tres numeros de
        kilogramosw a libras (1 libra = 0.454)


*/

public class ConversionLibras {

    public static void main(String[] args) {

     //Declaracion de CONSTANTES
        final double FACTOR_CONVERSION = 0.454;

        //Declaracion de variables de tres numeros dobles a convertir

        double kg1 = 0.0;
        double kg2 = 0.0;
        double kg3 = 0.0;

        double c1 = 0.0;
        double c2 = 0.0;
        double c3 = 0.0;

        String salida = "";



        //Solicitar los 3 numeros a calcular
        kg1 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de el primer Kg"));
        kg2 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de el segundo Kg"));
        kg3 = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de el tercer Kg"));

        //Proceso de conversion
        c1 = kg1 / FACTOR_CONVERSION;
        c2 = kg2 / FACTOR_CONVERSION;
        c3 = kg3 / FACTOR_CONVERSION;

        //salida o resultados de las operacion         la f quiere indicar . flotnate
        salida = kg1 + "Kg" + " en Libras es: " + String.format("%.2f",c1) + "\n" +
                     kg2 + " Kg" + "en Libras es: " + String.format("%.2f",c2) + "\n" +
                         kg3 + " Kg" + " en Libras es: " + String.format("%.2f",c3);

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
