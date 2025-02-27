import javax.swing.*;

public class ContinueAndBreak {

    public static void main(String[] args) {

        //declaracion de variables677
        int suma = 0, numero = 0, n = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el total de numeros a ingresar"));

        for (int i = 1; i <= n ; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero " + (i)));

            if (numero == 0) {
                continue;
            }

            if (numero < 0) {
                break;
            }

            suma+=numero;


        }

        JOptionPane.showMessageDialog(null, "La suma de los numeros es:"
                                                                             + suma);

    }
}