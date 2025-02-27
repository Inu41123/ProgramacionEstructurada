package While;

import javax.swing.*;

/*
Ejercicio 3: Contar hombres y mujeres en un grupo.
 */
public class Generos {
        public static void main(String[] args) {
            // Programa para contar el número de hombres y mujeres en un grupo de n personas
            int n, i = 1, hombres = 0, mujeres = 0;
            String genero;

            // Solicitar el número de personas
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));

            while (i <= n) {
                // Solicitar el género de la persona

                genero = JOptionPane.showInputDialog("Ingrese el género de la persona " + i + " (H/M):").toUpperCase();

                if (genero.equals("H")) {
                    hombres++;
                } else if (genero.equals("M")) {
                    mujeres++;
                }

                i++;
            }

            // Mostrar los resultados
            String resultado = "Número de hombres: " + hombres + "\n" +
                    "Número de mujeres: " + mujeres;
            JOptionPane.showMessageDialog(null, resultado);
        }
}
