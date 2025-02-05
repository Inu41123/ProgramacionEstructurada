package EjerciciosUnidad1;



import javax.swing.*;
public class Celsius {

        public static void main(String[] args) {

            // Declarar la variable para la temperatura en grados Celsius y Fahrenheit
            double celsius = 0.0;
            double fahrenheit = 0.0;

            // Pedir al usuario que ingrese la temperatura en grados Celsius
            celsius = Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en grados Celsius:"));

            // Convertir Celsius a Fahrenheit usando la fórmula
            fahrenheit = (9.0 / 5.0) * celsius + 32;

            // Mostrar el resultado
            String salida = celsius + " grados Celsius equivalen a: " + String.format("%.2f", fahrenheit) + " grados Fahrenheit.";

            // Mostrar el mensaje con JOptionPane
            JOptionPane.showMessageDialog(null, salida);
        }

}
