import javax.swing.*;

public class Empresa {

    public static void main(String[] args) {

        //Declaracion de variables
        double saldo = 0.0;
        double prestamo = 0.0;
        double equipoComputo = 5000;
        double mobliario = 10000;
        double compraInsumos = 0.0;
        double incentivos = 0.0;
        String cadena = "";

        //Solicitar el saldo
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo"));

        if (saldo < 0.0) {
            prestamo = 10000.0;

        } else if (saldo>0.0 && saldo < 20000) {
            prestamo = (20000.0 - saldo);

        }else {
            prestamo = saldo;
        }


        prestamo-= equipoComputo;
        prestamo-= mobliario;
        compraInsumos = prestamo/2;
        prestamo -= prestamo/2.0;
        prestamo -=compraInsumos;
        incentivos = prestamo;

        cadena = "Resultados\n" +
                "Compra de insumos \n" + compraInsumos +
                "\nIncentivos del personal " + incentivos +
                "\nEquipo Computo" + "\nmobiliarios " + mobliario;

        JOptionPane.showMessageDialog(null, cadena);

    }

}
