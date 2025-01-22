import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {

        double radio = 0.0, area2 = 0.0;
        final double pi = 3.1416;
        double area = Math.PI * radio * radio;
        String salida = "";
        area2 = pi * Math.pow(radio, 2);

        radio = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor del radio: "));

        salida = "El area del circulo con radio: " + radio + " es " + area;

        JOptionPane.showMessageDialog(null,salida);

    }
}

