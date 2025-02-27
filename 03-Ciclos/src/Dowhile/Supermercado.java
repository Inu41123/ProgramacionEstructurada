package Dowhile;

import javax.swing.*;

/*
Ejercicio 2: Total de compras en un supermercado.
 */
public class Supermercado {
        public static void main(String[] args) {
            // Programa para calcular el total de compras de una ama de casa
            double precio, total = 0;
            int cantidad;
            char continuar;

            do {
                // Solicitar el precio del artículo
                precio = Double.parseDouble
                        (JOptionPane.showInputDialog("Ingrese el precio del artículo:"));

                // Solicitar la cantidad de artículos
                cantidad = Integer.parseInt
                        (JOptionPane.showInputDialog("Ingrese la cantidad de artículos:"));

                // Calcular el subtotal y sumarlo al total
                total += precio * cantidad;

                // Preguntar si hay otro artículo
                continuar =
                        JOptionPane.showInputDialog
                                ("¿Desea agregar otro artículo? (s/n):").toLowerCase().charAt(0);


            } while (continuar == 's');

            // Mostrar el total de la compra
            JOptionPane.showMessageDialog
                    (null, "El total de la compra es: $" + total);
        }
}
