import javax.swing.*;

public class ControlCalificacion {

    public static void main(String[] args) {

        double calif = 0.0;
        String salida = "";
        char letra = ' ';

        //
        calif = Double.parseDouble(JOptionPane.showInputDialog("Introducce la Calificacion"));

        //Proceso
        if (calif >= 0.0 && calif <= 10.0) {

            if (calif >= 9.0) {
                letra = 'A';

            } else if (calif >= 8.0) {
                letra = 'B';

            } else if (calif >= 7.0) {
                letra = 'C';

            } else if (calif >= 6.0) {
                letra = 'C';

            } else {
                letra = 'F';
            }
            JOptionPane.showMessageDialog(null, "tu calificaicon es: " + calif + "Corresponde a una letra " + letra);

        }else{
            salida = "calificaion no valida";
        }

    }
}
