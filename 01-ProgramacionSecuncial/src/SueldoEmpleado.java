/*
Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
siguientes características
a. Se debe almacenar el nombre del empleado
b. Las horas trabajadas que deben ser horas sin parte fraccionaria
c. Cuota por hora
d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir

 */
import javax.swing.*;

public class SueldoEmpleado {

    public static void main(String[] args) {

        // Declarar variables
        int cuota = 0;
        int horasTrabajadas = 0;
        double sueldo = 0.0;
        String salida = "", nombre = "";

        // Pedir datos
        cuota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cuota por hora:"));
        nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado:");
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas (sin decimales):"));

        // Calcular el sueldo
        sueldo = horasTrabajadas * cuota;

        // Salida
        salida = "El empleado " + nombre + "\n" +
                "que ha trabajado un total de: " + horasTrabajadas + " horas" + "\n" +
                "Con una cuota por hora de: " + String.format("%.2f", (double) cuota) + " pesos" + "\n" +
                "Va a percibir un sueldo total de: " + String.format("%.2f", sueldo) + " pesos";

        JOptionPane.showMessageDialog(null, salida);
    }
}
