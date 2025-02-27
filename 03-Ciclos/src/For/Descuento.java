package For;
import javax.swing.JOptionPane;

/*
Ejercicio 5: Descuento del 15% para clientes que compran más de 10 kilos de naranjas.
 */

public class Descuento {
    public static void main(String[] args) {
        // Programa para calcular el descuento del 15% para clientes que compran más de 10 kilos de naranjas
        int n = 15;
        double kilos, precioKilo = 2.5, descuento, totalCliente, totalTienda = 0;
        String input;

        // Solicitar la cantidad de kilos para cada cliente
        for (int i = 1; i <= n; i++) {
            kilos = Double.parseDouble(JOptionPane.showInputDialog
                    ("Ingrese los kilos de naranjas comprados por el cliente " + i + ":"));

            if (kilos > 10) {
                descuento = 0.15 * (kilos * precioKilo);
                totalCliente = (kilos * precioKilo) - descuento;
            } else {
                totalCliente = kilos * precioKilo;
            }

            totalTienda += totalCliente;

            // Mostrar el total a pagar por el cliente
            JOptionPane.showMessageDialog(null, "El cliente " + i + " debe pagar: $" + totalCliente);
        }

        // Mostrar el total percibido por la tienda
        JOptionPane.showMessageDialog(null, "La tienda percibió un total de: $" + totalTienda);
    }
}