import javax.swing.*;

public class Carros {

    public static void main(String[] args) {
        //Variables
        int amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;
        int i = 0;
        int n;
        String salida = " ";

        //Desarrollo
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de autos"));

                while (i < n) {
                    int digito = Integer.parseInt(JOptionPane.showInputDialog("Introduce el " +
                            "último dígito de la placa del auto" + (i + 1) + ":"));

                    // Clasificación según el color de la calcomanía
                    if (digito == 1 || digito == 2) {
                        amarilla++;
                    } else if (digito == 3 || digito == 4) {
                        rosa++;
                    } else if (digito == 5 || digito == 6) {
                        roja++;
                    } else if (digito == 7 || digito == 8) {
                        verde++;
                    } else if (digito == 9 || digito == 0) {
                        azul++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Dígito inválido, " +
                                "intenta de nuevo.");
                        continue;
                    }
                    i++;
                }

                // Mostrar los resultados
                 salida = "Carros con Calcomania de color:\n" +
                        "Amarillos: " + amarilla + "\n" +
                        "Rosas: " + rosa + "\n" +
                        "Rojos: " + roja + "\n" +
                        "Verdes: " + verde + "\n" +
                        "Azules: " + azul;
                JOptionPane.showMessageDialog(null, salida);

    }
}
