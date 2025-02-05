package EjerciciosUnidad1;


import javax.swing.*;
public class Vendedor {
    
        public static void main(String[] args) {

            // Declarar variables
            double sueldoBase = 0.0;
            double venta1 = 0.0, venta2 = 0.0, venta3 = 0.0;
            double comision = 0.10; // 10% de comisión
            double totalComisiones = 0.0;
            double sueldoTotal = 0.0;

            // Pedir datos de entrada
            sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo base del vendedor:"));
            venta1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto de la primera venta:"));
            venta2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto de la segunda venta:"));
            venta3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto de la tercera venta:"));

            // Calcular las comisiones de las tres ventas
            totalComisiones = (venta1 + venta2 + venta3) * comision;

            // Calcular el sueldo total
            sueldoTotal = sueldoBase + totalComisiones;

            // Crear el mensaje de salida
            String salida = "Sueldo Base: " + String.format("%.2f", sueldoBase) + "\n" +
                    "Comisión por ventas: " + String.format("%.2f", totalComisiones) + "\n" +
                    "Total a recibir en el mes: " + String.format("%.2f", sueldoTotal);

            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, salida);
        }

}
