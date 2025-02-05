package EjerciciosUnidad1;

/*
Escribir un programa para calcular y de salida el perímetro y el área de un círculo con
un radio de 3,2 pulgadas
 */
import javax.swing.*;

public class PartesCirculo {

        public static void main(String[] args) {
            // Declarar el radio del círculo
            double radio = 3.2;

            // Calcular el perímetro (circunferencia) del círculo
            double perimetro = 2 * Math.PI * radio;

            // Calcular el área del círculo
            double area = Math.PI * Math.pow(radio, 2);

            // Mostrar los resultados
            JOptionPane.showMessageDialog(null, "Para un círculo con radio de " + radio + " pulgadas:");
            JOptionPane.showMessageDialog(null, "El perímetro (circunferencia) es: " + String.format("%.2f", perimetro) + " pulgadas.");
            JOptionPane.showMessageDialog(null, "El área es: " + String.format("%.2f", area) + " pulgadas cuadradas.");
        }

}
