import javax.swing.*;

public class CalifiacionesSentinel2 {

    public static void main(String[] args) {
        boolean sentinel = true;

        //Declaracion de variables
        int numAprobados = 0;
        int numReprobados = 0;
        double calif = 0.0;

        JOptionPane.showMessageDialog(null, "Este programa cuenta el numero " +
                "de calificaciones aprobatorias y reprobatorias" + "\n" + "Para terminar introduce " +
                "una califiacion con menos 1 (-1)");


        int x = 1;
        while (sentinel){
            calif = Double.parseDouble(JOptionPane.
                    showInputDialog(null, "introduce la califiacion: " + x));

            if (calif!=-1){
                if (calif >= 7.0){
                    numAprobados++;
                }else{
                    numReprobados++;
                }
                x++;
            }else{
                sentinel = false;
            }
        }

        JOptionPane.showMessageDialog(null,
                "el numero de aprobados " + numAprobados + "\n" +
                        "el numero de reprobados: " + numReprobados);

    }
}
