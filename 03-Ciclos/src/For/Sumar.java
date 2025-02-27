package For;

/*
Ejercicio 7: Suma de diez cantidades.
 */


import javax.swing.*;
public class Sumar {

        public static void main(String[] args) {
            // Programa para obtener la suma de diez cantidades
            double suma = 0, cantidad;


            // Solicitar las diez cantidades
            for (int i = 1; i <= 10; i++) {
                cantidad = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese la cantidad " + i + ":"));
                suma += cantidad;
            }

            // Mostrar la suma
            JOptionPane.showMessageDialog
                    (null, "La suma de las diez cantidades es: " + suma);
        }
}
