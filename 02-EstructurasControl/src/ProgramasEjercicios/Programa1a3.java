package ProgramasEjercicios;

import javax.swing.*;

public class Programa1a3 {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el programa a ejecutar (1-3):"));

        switch (opcion) {
            case 1:
                programa1();
                break;
            case 2:
                programa2();
                break;
            case 3:
                programa3();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }

    public static void programa1() {
        // Definir variables
        int cantidad;
        double precioUnidad = 11000;
        double descuento = 0;
        double total;

        // Pedir al usuario la cantidad de computadoras
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de computadoras a comprar:"));

        // Determinar el descuento
        if (cantidad < 5) {
            descuento = 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = 0.20;
        } else {
            descuento = 0.40;
        }

        // Calcular total con descuento
        total = cantidad * precioUnidad * (1 - descuento);

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Cantidad de computadoras: " + cantidad + "\n" +
                "Descuento aplicado: " + (descuento * 100) + "%\n" +
                "Total a pagar: $" + String.format("%.2f", total));
    }

    public static void programa2() {
        // Definir variables
        int cantidad;
        double precioUnitario;
        double total;

        // Pedir al usuario la cantidad de llantas
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de llantas a comprar:"));

        // Determinar el precio unitario según la cantidad
        if (cantidad < 5) {
            precioUnitario = 300;
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioUnitario = 250;
        } else {
            precioUnitario = 200;
        }

        // Calcular el total
        total = cantidad * precioUnitario;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "Cantidad de llantas: " + cantidad + "\n" +
                "Precio por llanta: $" + precioUnitario + "\n" +
                "Total a pagar: $" + String.format("%.2f", total));
    }

    public static void programa3() {
        // Definir las preguntas y respuestas correctas
        String[] preguntas = {
                "¿Colón descubrió América? (Sí/No)",  // Respuesta correcta: Sí
                "¿La independencia de México fue en el año 1810? (Sí/No)",  // Respuesta correcta: Sí
                "¿The Doors fue un grupo de rock americano? (Sí/No)"  // Respuesta correcta: Sí
        };
        String[] respuestasCorrectas = {"Sí", "Sí", "Sí"};

        // Recorrer las preguntas
        for (int i = 0; i < preguntas.length; i++) {
            String respuesta = JOptionPane.showInputDialog(preguntas[i]);

            // Verificar la respuesta (ignorar mayúsculas/minúsculas)
            if (!respuesta.equalsIgnoreCase(respuestasCorrectas[i])) {
                JOptionPane.showMessageDialog(null, "¡Respuesta incorrecta! Has perdido el juego.");
                return;  // Termina el programa si se responde mal
            }
        }

        // Si responde correctamente todas, gana
        JOptionPane.showMessageDialog(null, "¡Felicidades! Respondiste correctamente todas las preguntas.");
    }
}