package For;
import javax.swing.JOptionPane;
/*
Ejercicio 3: Calcular y multiplicar la tabla de multiplicar de un número cualquiera.
 */
public class Multi {
    public static void main(String[] args) {
        // Programa para calcular y mostrar la tabla de multiplicar de un número
        int numero, producto;
        String input, resultado = "";

        // Solicitar el número
        numero = Integer.parseInt(JOptionPane.showInputDialog
                ("Ingrese un número para generar su tabla de multiplicar:"));

        // Calcular y concatenar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            producto = numero * i;
            resultado += numero + " x " + i + " = " + producto + "\n";
        }

        // Mostrar la tabla de multiplicar
        JOptionPane.showMessageDialog(null, resultado);
    }
}