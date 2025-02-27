import javax.swing.*;

public class Empresa {
    public static void main(String[] args) {
        //Declaracion de variables
        int i = 0;
        int numTranajadores = 0;
        int horasTrabajadas = 0, horasExtras = 0;
        double salarioTotal = 0.0;
        String sandia = "";

        numTranajadores = Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce el numero de trabajares"));


        sandia = "Reporte de salario semanales\n" +
                "Empleado     " + "Horas Trabajadas  " +
                "Horas Exra    " + "Salario Total\n";

        i = 1;
        while (i <= numTranajadores){

            horasTrabajadas = Integer.parseInt(JOptionPane.
                    showInputDialog("Numero de horas trabajadas: "));


            horasExtras = 0;
            if (horasTrabajadas <= 40) {
                salarioTotal = horasTrabajadas * 20;
                sandia+="Empleado " + i + "  " + horasTrabajadas + "   " + horasExtras + "   " + salarioTotal +"\n";
            }else {
                horasExtras = horasTrabajadas - 40;
                salarioTotal = 40 * 20 + horasExtras * 25;
                salarioTotal = horasTrabajadas * 20;
                sandia+="Empleado " + i + "  " + horasTrabajadas + "   " + horasExtras + "   " + salarioTotal +"\n";
            } 
            i++;
        }

        JOptionPane.showMessageDialog(null, sandia);

    }
}
