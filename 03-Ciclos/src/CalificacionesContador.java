import javax.swing.*;

public class CalificacionesContador {

    public static void main(String[] args) {
        //Declaracion de variables
        int numAprobados = 0;
        int numReprobados = 0;
        int numeroCalif = 0;
        double calif = 0.0;

        numeroCalif = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE EL NUMERO0 DE CALIFICACIONES"));

        for (int i = 1; i <= numeroCalif; i++) {

            calif = Double.parseDouble(JOptionPane.
                    showInputDialog(null, "introduce la califiacion: " + i));

            if (calif >= 7.0) {
                //contador de numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }

        }//Cierra ciclo for

        JOptionPane.showMessageDialog(null,
                "el numero de aprobados " + numAprobados + "\n" +
                        "el numero de reprobados: " + numReprobados);


        int i = 1;
        numAprobados = 0;
        numReprobados = 0;

        while (i <= numeroCalif) {

            calif = Double.parseDouble(JOptionPane.
                    showInputDialog(null, "introduce la califiacion: " + i));

            if (calif >= 7.0) {
                //contador de numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }


            i++;
        }

        JOptionPane.showMessageDialog(null,
                "el numero de aprobados " + numAprobados + "\n" +
                        "el numero de reprobados: " + numReprobados);

        i = 1;
        numAprobados = 0;
        numReprobados = 0;

        do {

            calif = Double.parseDouble(JOptionPane.
                    showInputDialog(null, "introduce la califiacion: " + i));

            if (calif >= 7.0) {
                //contador de numero de aprobados
                numAprobados++;
            } else {
                numReprobados++;
            }

            i++;
        } while ((i <= numeroCalif));

        JOptionPane.showMessageDialog(null,
                "el numero de aprobados " + numAprobados + "\n" +
                        "el numero de reprobados: " + numReprobados);





    }
}
