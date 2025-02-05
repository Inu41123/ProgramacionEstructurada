import javax.swing.*;

public class ProgramaPar {

    public static void main(String[] args) {

        //declaracion de variables
        int numero = 0;
        String salida = "";

        //Entrada

        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu numero"));

        //Proceso
        if(numero%2 == 0) {

            JOptionPane.showMessageDialog(null, "El numero es par");

        }else {

            JOptionPane.showMessageDialog(null, "El numero es impar");

        }


    }

}
