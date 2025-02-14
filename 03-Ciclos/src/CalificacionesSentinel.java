import javax.swing.*;

public class CalificacionesSentinel {

    public static void main(String[] args) {
        final int SENTINEL = -1;

        //Declaracion de variables
        int numAprobados = 0;
        int numReprobados = 0;
        double calif = 0.0;

        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero " +
                "de calificaciones aprobatorias y reprobatorias" + "\n" + "Para terminar introduce " +
                "una califiacion con menos 1 (-1)");


        int x = 1;
        while (calif != SENTINEL){
            calif = Double.parseDouble(JOptionPane.
                    showInputDialog(null, "introduce la califiacion: " + x));

            if (calif!=SENTINEL){
                if (calif >= 7.0){
                    numAprobados++;
                }else{
                    numAprobados++;
                }
            x++;
        }
        }

        JOptionPane.showMessageDialog(null,
                "el numero de aprobados " + numAprobados + "\n" +
                        "el numero de reprobados: " + numReprobados);

    }

}
