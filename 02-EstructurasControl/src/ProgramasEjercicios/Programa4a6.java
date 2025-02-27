package ProgramasEjercicios;

import javax.swing.*;

public class Programa4a6 {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el programa a ejecutar (4-6):"));

        switch (opcion) {
            case 4:
                programa4();
                break;
            case 5:
                programa5();
                break;
            case 6:
                programa6();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }

    public static void programa4() {
        // Pedir el precio del estéreo sin IVA
        double precioBase = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del estéreo sin IVA:"));

        // Pedir la marca del estéreo
        String marca = JOptionPane.showInputDialog("Introduce la marca del estéreo:");

        // Inicializar descuento
        double descuento = 0;

        // Aplicar descuento del 10% si el precio es mayor o igual a $2000
        if (precioBase >= 2000) {
            descuento += 0.10;
        }

        // Aplicar descuento adicional del 5% si la marca es "NOSY"
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;
        }

        // Calcular el precio con descuento
        double precioConDescuento = precioBase * (1 - descuento);

        // Calcular el IVA (16%)
        double iva = precioConDescuento * 0.16;

        // Calcular el precio final con IVA
        double precioFinal = precioConDescuento + iva;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Precio base: $" + String.format("%.2f", precioBase) +
                "\nDescuento aplicado: " + (descuento * 100) + "%" +
                "\nPrecio con descuento: $" + String.format("%.2f", precioConDescuento) +
                "\nIVA (16%): $" + String.format("%.2f", iva) +
                "\nPrecio final con IVA: $" + String.format("%.2f", precioFinal));
    }

    public static void programa5() {
        // Precio por kilo de manzanas
        double precioPorKilo = 50.0;

        // Pedir la cantidad de kilos comprados
        double kilos = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de kilos de manzanas que deseas comprar:"));

        // Determinar el porcentaje de descuento
        double descuento = 0;
        if (kilos > 10) {
            descuento = 0.20;  // 20% de descuento
        } else if (kilos > 5) {
            descuento = 0.15;  // 15% de descuento
        } else if (kilos > 2) {
            descuento = 0.10;  // 10% de descuento
        }

        // Calcular el precio total sin descuento
        double precioTotal = kilos * precioPorKilo;

        // Aplicar el descuento
        double montoDescuento = precioTotal * descuento;
        double precioFinal = precioTotal - montoDescuento;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Cantidad de kilos comprados: " + kilos + " kg" +
                "\nPrecio por kilo: $" + precioPorKilo +
                "\nPrecio total sin descuento: $" + String.format("%.2f", precioTotal) +
                "\nDescuento aplicado: " + (descuento * 100) + "%" +
                "\nMonto descontado: $" + String.format("%.2f", montoDescuento) +
                "\nPrecio final a pagar: $" + String.format("%.2f", precioFinal));
    }

    public static void programa6() {
        // Pedir el capital actual de la empresa
        double capitalActual = Double.parseDouble(JOptionPane.showInputDialog("Introduce el capital actual de la empresa:"));

        // Determinar si es necesario pedir un préstamo
        double capitalFinal = capitalActual;  // Inicialmente igual al capital actual
        double prestamo = 0;

        if (capitalActual < 0) {
            prestamo = 10000 - capitalActual;  // Ajustar a $10,000
            capitalFinal = 10000;
        } else if (capitalActual > 0 && capitalActual < 20000) {
            prestamo = 20000 - capitalActual;  // Ajustar a $20,000
            capitalFinal = 20000;
        }

        // Repartición del presupuesto
        double equipoComputo = 5000;
        double mobiliario = 2000;
        double restante = capitalFinal - (equipoComputo + mobiliario);
        double insumos = restante / 2;
        double incentivos = restante / 2;

        // Mostrar los resultados
        JOptionPane.showMessageDialog(null, "Capital inicial: $" + capitalActual +
                "\nPréstamo solicitado: $" + prestamo +
                "\nCapital final después del préstamo: $" + capitalFinal +
                "\n\nDistribución del presupuesto:" +
                "\n- Equipo de cómputo: $" + equipoComputo +
                "\n- Mobiliario: $" + mobiliario +
                "\n- Compra de insumos: $" + insumos +
                "\n- Incentivos al personal: $" + incentivos);
    }
}