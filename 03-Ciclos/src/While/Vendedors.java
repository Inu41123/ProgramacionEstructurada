package While;
import javax.swing.*;

/*
Ejercicio 1: Sueldo y comisiones de vendedores.
 */

public class Vendedors {
        public static void main(String[] args) {
            // Programa para calcular el sueldo y comisiones de n vendedores
            int n, i = 1;
            double sueldoBase, venta, comisiones, sueldoTotal;

            // Solicitar el número de vendedores
            n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));

            while (i <= n) {
                // Solicitar el sueldo base del vendedor
                sueldoBase = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese el sueldo base del vendedor " + i + ":"));

                // Solicitar las tres ventas del vendedor
                comisiones = 0;
                for (int j = 1; j <= 3; j++) {

                    venta = Double.parseDouble
                            (JOptionPane.showInputDialog
                                    ("Ingrese el monto de la venta " + j + " del vendedor " + i + ":"));
                    comisiones += venta * 0.10;
                }

                // Calcular el sueldo total
                sueldoTotal = sueldoBase + comisiones;

                // Mostrar los resultados
                String resultado = "Vendedor " + i + ":\n" +
                        "Comisiones: $" + comisiones + "\n" +
                        "Sueldo total: $" + sueldoTotal;
                JOptionPane.showMessageDialog(null, resultado);

                i++;
            }
        }
}
