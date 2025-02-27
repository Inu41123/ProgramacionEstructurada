import javax.swing.*;

public class Ecuacion1 {

    public static void main(String[] args) {

        //Declaracion de variables
        int n = 0;
        int denSup = 0;
        int denO= 0;
        double x = 0.0;
        double S = 0.0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de fracciones"));
            x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de x"));

            if (n < 0 || x < 0.0) {
                String mensaje = "Error: ";

                if (n < 0 && x < 0) {
                    mensaje += "Ambos valores son negativos: \n" + "n: " + n + "\nx: " + x;
                } else if (n < 0) {
                    mensaje += "El número de fracciones (n) es negativo: " + n + "\n";
                } else {
                    mensaje += "El valor de x es negativo: " + x + "\n";
                }

                JOptionPane.showMessageDialog(null, mensaje + "  \nVuelve a ingresar los datos");
            }
        } while (n < 0 || x < 0.0);

    /*
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de fracciones"));

            x = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de x"));

            if (n<0 || x<0.0) {
                JOptionPane.showMessageDialog(null, "Alguna de las opciones es negativa");
            }
        }while (n<0 || x<0.0);
        */

        //inicializar
        denSup = 3;
        denO = 1;

        for (int i = 1; i <= n; i++) {

            S+=Math.pow(x,3.0/denSup)/denO;
            denSup+=3;
            denO+=2;

        }


        JOptionPane.showMessageDialog(null, "el valor de S es: " + String.format("%.2f", S));

    }

}
