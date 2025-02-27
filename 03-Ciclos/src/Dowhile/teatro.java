package Dowhile;

import javax.swing.*;

/*
Ejercicio 3: Descuentos en un teatro según la edad.
 */
public class teatro {
        public static void main(String[] args) {
            // Programa para calcular el descuento en un teatro según la edad del cliente
            int edad, precioEntrada = 100; // Precio único de la entrada
            double descuento, totalPagar, perdidaTotal = 0;
            char continuar = 0;

            do {
                // Solicitar la edad del cliente
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));

                // Verificar si el cliente puede entrar al teatro
                if (edad < 5) {
                    JOptionPane.showMessageDialog
                            (null, "Los niños menores d" +
                                    "e 5 años no pueden entrar al teatro.");
                    continue;
                }

                // Calcular el descuento según la categoría
                if (edad >= 5 && edad <= 14) {
                    descuento = precioEntrada * 0.35;
                } else if (edad >= 15 && edad <= 19) {
                    descuento = precioEntrada * 0.25;
                } else if (edad >= 20 && edad <= 45) {
                    descuento = precioEntrada * 0.10;
                } else if (edad >= 46 && edad <= 65) {
                    descuento = precioEntrada * 0.25;
                } else {
                    descuento = precioEntrada * 0.35;
                }

                // Calcular el total a pagar
                totalPagar = precioEntrada - descuento;

                // Acumular la pérdida total del teatro
                perdidaTotal += descuento;

                // Mostrar el resultado
                JOptionPane.showMessageDialog(null, "El cliente debe pagar: $" + totalPagar);

                // Preguntar si hay otro cliente
                continuar = JOptionPane.showInputDialog
                        ("¿Hay otro cliente? (s/n):").toLowerCase().charAt(0);
                
            } while (continuar == 's');

            // Mostrar la pérdida total del teatro
            JOptionPane.showMessageDialog(null, "El teatro dejó de percibir un total de: $" + perdidaTotal);
        }
}
