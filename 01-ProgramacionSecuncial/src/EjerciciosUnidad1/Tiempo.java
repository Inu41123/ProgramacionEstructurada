package EjerciciosUnidad1;



import javax.swing.*;

public class Tiempo {


        public static void main(String[] args) {

            // Declarar la variable para los segundos y minutos
            int segundos = 0;
            int minutos = 0;
            int restoSegundos = 0;

            // Pedir al usuario que ingrese el número de segundos
            segundos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de segundos:"));

            // Calcular los minutos y los segundos restantes
            minutos = segundos / 60; // División entera para obtener los minutos
            restoSegundos = segundos % 60; // Resto para obtener los segundos restantes

            // Mostrar el resultado
            String salida = segundos + " segundos equivalen a: " + minutos + " minutos y " + restoSegundos + " segundos.";

            // Mostrar el mensaje con JOptionPane
            JOptionPane.showMessageDialog(null, salida);
        }
}
