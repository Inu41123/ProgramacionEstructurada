import javax.swing.*;

public class CalculadoraRecargada {

    public static void main(String[] args) {

        //Declaracion de variables
        String menu = "";
        String opcion = "", resulrado = "";
        double numero1, numero2;

        //Entrada
        menu = "MENU PRINCIPAL" + "\n" +
                "a) Suma" + "\n" +
                "b) Resta" + "\n" +
                "c) Dividir" + "\n" +
                "d) Multiplicar" + "\n" +
                "e) Modulo" + "\n" +
                "\n" + "elegie un opcion";

        opcion = JOptionPane.showInputDialog(menu);


        numero1 = Double.parseDouble(JOptionPane.showInputDialog("INTRODUCE EL NUMERO 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("INTRODUCE EL NUMERO 2"));

    //Convierte una letra mayuscula
        opcion = opcion.toUpperCase();
        if (numero2>0.0){

            switch (opcion) {
                case "A":
                    resulrado ="la suma es: " + (numero1 + numero2);

                    break;

                case "B":
                    resulrado ="la resta es: " + (numero1 - numero2);

                    break;

                case "C":
                    resulrado ="la division es: " + (numero1 / numero2);

                    break;

                case "D":

                    resulrado ="la multiplicacion es: " + (numero1 * numero2);

                    break;

                case "E":
                    resulrado ="la el modulo es: " + (numero1 % numero2);

                    break;

                default:
                    resulrado = "NO VALIDO";
            }

            JOptionPane.showMessageDialog(null, resulrado);

        }else{
            JOptionPane.showMessageDialog(null, "NO VALIDO");
        }


    }

}
