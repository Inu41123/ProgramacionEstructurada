import javax.swing.*;

public class Descuento {

    public static void main(String[] args) {

        //declaracion de variables
        double monto = 0.0, montoF = 0.0, desc = 0.0;
        String salida = "";

        //Entrada

        monto = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Monto"));

        //Proceso
        if(monto >= 100) {

            //descuento
            desc = monto * 0.10;
            montoF = desc + monto;


        }else {

            //descuento
            desc = monto * 0.5;
            montoF = desc + monto;


        }

        salida = "El monto total es " + montoF;
        JOptionPane.showMessageDialog(null, salida);

    }

}
