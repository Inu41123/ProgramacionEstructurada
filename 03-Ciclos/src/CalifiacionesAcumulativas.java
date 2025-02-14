import javax.swing.*;

public class CalifiacionesAcumulativas {

    public static void main(String[] args) {

        double calif = 0.0;
        double califacum = 0.0;
        int numvalif = 0, s = 0;

        numvalif = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de la Calificacion"));

        for (int i = 0; i<numvalif; i++){

            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la ccalificacion" + (i+1)));
            califacum = califacum + calif;
        }

        JOptionPane.showMessageDialog(null, "La sumatoria es: " + califacum +
                "\n" + "el promedio es " + ( califacum = califacum/numvalif)

        );


        while (s < numvalif){

            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la ccalificacion" + (s++)));

            califacum = califacum + calif;
        }

        JOptionPane.showMessageDialog(null, "La sumatoria es: " + califacum +
                "\n" + "el promedio es " + ( califacum = califacum/numvalif)

        );

    }

}
