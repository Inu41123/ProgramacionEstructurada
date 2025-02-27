package For;
import javax.swing.JOptionPane;
/*
Ejercicio 4: Promedio de peso de niños, jóvenes, adultos y viejos en una zona habitacional.
 */
public class Peso {
    public static void main(String[] args) {
        // Programa para calcular el promedio de peso de niños, jóvenes, adultos y viejos
        int n, edad;
        double peso, sumaNiños = 0, sumaJovenes = 0, sumaAdultos = 0, sumaViejos = 0;
        int contadorNiños = 0, contadorJovenes = 0, contadorAdultos = 0, contadorViejos = 0;

        // Solicitar el número de personas
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas:"));

        // Solicitar edad y peso de cada persona
        for (int i = 1; i <= n; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese la edad de la persona " + i + ":"));
            peso = Double.parseDouble
                    (JOptionPane.showInputDialog("Ingrese el peso de la persona " + i + ":"));

            if (edad >= 0 && edad <= 12) {
                sumaNiños += peso;
                contadorNiños++;
            } else if (edad >= 13 && edad <= 29) {
                sumaJovenes += peso;
                contadorJovenes++;
            } else if (edad >= 30 && edad <= 59) {
                sumaAdultos += peso;
                contadorAdultos++;
            } else if (edad >= 60) {
                sumaViejos += peso;
                contadorViejos++;
            }
        }

        // Calcular promedios
        double promedioNiños = contadorNiños > 0 ? sumaNiños / contadorNiños : 0;
        double promedioJovenes = contadorJovenes > 0 ? sumaJovenes / contadorJovenes : 0;
        double promedioAdultos = contadorAdultos > 0 ? sumaAdultos / contadorAdultos : 0;
        double promedioViejos = contadorViejos > 0 ? sumaViejos / contadorViejos : 0;

        // Mostrar los resultados
        String resultado = "Promedio de peso de Niños: " + promedioNiños + "\n" +
                "Promedio de peso de Jóvenes: " + promedioJovenes + "\n" +
                "Promedio de peso de Adultos: " + promedioAdultos + "\n" +
                "Promedio de peso de Viejos: " + promedioViejos;
        JOptionPane.showMessageDialog(null, resultado);
    }
}