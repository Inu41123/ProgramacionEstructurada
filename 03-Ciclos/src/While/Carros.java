package While;

/*
Ejercicio 4: Calcomanías de autos.
 */

import javax.swing.*;

public class Carros {
        public static void main(String[] args) {
            // Programa para contar las calcomanías de cada color en n autos
            int n, i = 1, amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;
            int digito;

            // Solicitar el número de autos
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de autos:"));

            while (i <= n) {
                // Solicitar el último dígito de la placa
                digito = Integer.parseInt
                        (JOptionPane.showInputDialog
                                ("Ingrese el último dígito de la placa del auto " + i + ":"));

                // Determinar el color de la calcomanía
                if (digito == 1 || digito == 2) {
                    amarilla++;
                } else if (digito == 3 || digito == 4) {
                    rosa++;
                } else if (digito == 5 || digito == 6) {
                    roja++;
                } else if (digito == 7 || digito == 8) {
                    verde++;
                } else if (digito == 9 || digito == 0) {
                    azul++;
                }

                i++;
            }

            // Mostrar los resultados
            String resultado = "Calcomanías Amarillas: " + amarilla + "\n" +
                    "Calcomanías Rosas: " + rosa + "\n" +
                    "Calcomanías Rojas: " + roja + "\n" +
                    "Calcomanías Verdes: " + verde + "\n" +
                    "Calcomanías Azules: " + azul;
            JOptionPane.showMessageDialog(null, resultado);
        }
}
