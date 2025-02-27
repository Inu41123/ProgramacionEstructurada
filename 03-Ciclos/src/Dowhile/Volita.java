package Dowhile;

import javax.swing.*;

/*
Ejercicio 1: Descuentos en una tienda según el color de la bolita.
 */
public class Volita {
    public class DescuentoTienda {
        public static void main(String[] args) {
            // Programa para calcular el descuento de cada cliente según el color de la bolita
            double totalCompra, descuento, totalPagar;
            String colorBolita, input;
            char continuar;

            do {
                // Solicitar el total de la compra
                input = JOptionPane.showInputDialog("Ingrese el total de la compra:");
                totalCompra = Double.parseDouble(input);

                // Solicitar el color de la bolita
                input = JOptionPane.showInputDialog
                        ("Ingrese el color de la bolita (roja, amarilla, blanca):");
                colorBolita = input.toLowerCase();

                // Calcular el descuento
                switch (colorBolita) {
                    case "roja":
                        descuento = totalCompra * 0.40;
                        break;
                    case "amarilla":
                        descuento = totalCompra * 0.25;
                        break;
                    case "blanca":
                        descuento = 0;
                        break;
                    default:
                        descuento = 0;
                        JOptionPane.showMessageDialog
                                (null, "Color no válido, no se " +
                                        "aplicará descuento.");
                        break;
                }

                // Calcular el total a pagar
                totalPagar = totalCompra - descuento;

                // Mostrar el resultado
                JOptionPane.showMessageDialog
                        (null, "El cliente debe pagar: $" + totalPagar);

                // Preguntar si hay otro cliente
                continuar = JOptionPane.showInputDialog
                        ("¿Hay otro cliente? (s/n):").toLowerCase().charAt(0);
            } while (continuar == 's');
        }
    }


}
