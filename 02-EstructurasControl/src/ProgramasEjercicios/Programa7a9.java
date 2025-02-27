package ProgramasEjercicios;

import javax.swing.*;

public class Programa7a9 {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el programa a ejecutar (7-9):"));

        switch (opcion) {
            case 7:
                programa7();
                break;
            case 8:
                programa8();
                break;
            case 9:
                programa9();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }

    public static void programa7() {
        // Solicitar datos del paciente
        double hemoglobina = Double.parseDouble(JOptionPane.showInputDialog("Introduce el nivel de hemoglobina (g%):"));
        double edad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la edad en años:"));
        String sexo = "";

        if (edad > 15) {
            sexo = JOptionPane.showInputDialog("Introduce el sexo (M para masculino, F para femenino):").toUpperCase();
        }

        // Determinar rango de hemoglobina normal
        double min = 0, max = 0;

        if (edad >= 0 && edad <= 1.0 / 12) { // 0 - 1 mes
            min = 13; max = 26;
        } else if (edad > 1.0 / 12 && edad <= 0.5) { // >1 y ≤ 6 meses
            min = 10; max = 18;
        } else if (edad > 0.5 && edad <= 1) { // >6 y ≤ 12 meses
            min = 11; max = 15;
        } else if (edad > 1 && edad <= 5) { // >1 y ≤ 5 años
            min = 11.5; max = 15;
        } else if (edad > 5 && edad <= 10) { // >5 y ≤ 10 años
            min = 12.6; max = 15.5;
        } else if (edad > 10 && edad <= 15) { // >10 y ≤ 15 años
            min = 13; max = 15.5;
        } else if (edad > 15) {
            if (sexo.equals("F")) { // Mujeres > 15 años
                min = 12; max = 16;
            } else if (sexo.equals("M")) { // Hombres > 15 años
                min = 14; max = 18;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo no válido. Usa 'M' o 'F'.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Edad no válida.");
            return;
        }

        // Diagnóstico
        String resultado = (hemoglobina < min) ? "Positivo (Tienes anemia)" : "Negativo (No tienes anemia)";

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "Edad: " + edad + " años\n"
                + "Sexo: " + (edad > 15 ? (sexo.equals("M") ? "Masculino" : "Femenino") : "No aplica") + "\n"
                + "Nivel de hemoglobina: " + hemoglobina + " g%\n"
                + "Rango normal: " + min + " - " + max + " g%\n"
                + "Diagnóstico: " + resultado);
    }

    public static void programa8() {
        // Solicitar datos del estudiante
        String nivel = JOptionPane.showInputDialog("¿El alumno es de Preparatoria o Profesional? (P/PR)").toUpperCase();
        double promedio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el promedio del alumno:"));
        int unidades = 0;
        double descuento = 0.0, costoUnitario = 0.0, totalPagar = 0.0;

        // Determinar reglas para Preparatoria
        if (nivel.equals("P")) {
            int materiasReprobadas = 0;
            if (promedio <= 7) {
                materiasReprobadas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de materias reprobadas:"));
            }

            if (promedio >= 9.5) {
                unidades = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                unidades = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                unidades = 50;
            } else if (materiasReprobadas <= 3) {
                unidades = 45;
            } else {
                unidades = 40;
            }

            costoUnitario = 180;
        }

        // Determinar reglas para Profesional
        else if (nivel.equals("PR")) {
            unidades = 55;
            costoUnitario = 300;
            if (promedio >= 9.5) {
                descuento = 0.20;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nivel educativo inválido. Usa 'P' para Preparatoria o 'PR' para Profesional.");
            return;
        }

        // Calcular costo total
        totalPagar = unidades * costoUnitario * (1 - descuento);

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "Nivel: " + (nivel.equals("P") ? "Preparatoria" : "Profesional") + "\n"
                + "Promedio: " + promedio + "\n"
                + "Unidades a cursar: " + unidades + "\n"
                + "Costo por unidad: $" + costoUnitario + "\n"
                + "Descuento aplicado: " + (descuento * 100) + "%\n"
                + "Total a pagar: $" + String.format("%.2f", totalPagar));
    }

    public static void programa9() {
        // Solicitar los tres números
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número:"));

        // Verificar que los números sean distintos
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            JOptionPane.showMessageDialog(null, "Los números deben ser distintos.");
            return;
        }

        // Determinar el número medio
        int medio;
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            medio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            medio = num2;
        } else {
            medio = num3;
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El número medio es: " + medio);
    }
}