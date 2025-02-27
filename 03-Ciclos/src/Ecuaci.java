import javax.swing.*;

public class Ecuaci {

    public static void main(String[] args) {

            //Declaracion de variables
            int n = 0;
            int denSup = 0;
            int denO= 0;
            double x = 0.0;
            double S = 0.0;

            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de fracciones"));

            x = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de x"));

            //inicializar
            denSup = 3;
            denO = 1;

            for (int i = 1; i <= n; i++) {

                S+=Math.pow(x,3.0/denSup)/denO;
                denSup+=3;
                denO+=2;

            }


            JOptionPane.showMessageDialog(null, "el valor de" + S);


    }

}
