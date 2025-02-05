import javax.swing.*;

public class DescuentoV2 {

    public static void main(String[] args) {


        //declaracion de variables
        double monto = 0.0;
        String salida = "";

        //Entrada

        monto = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu Monto"));

        //Proceso
        if(monto >= 100) {

            //descuento
            monto *= 0.90;

        }else {

            //descuento
            monto *= 0.95;

        }

        salida = "El monto total es " + monto;
        JOptionPane.showMessageDialog(null, salida);


    }

}
