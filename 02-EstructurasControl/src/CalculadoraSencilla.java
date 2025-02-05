import javax.swing.*;

public class CalculadoraSencilla {

    public static void main(String[] args) {

        //Declaracion de variables
        String menu = "";
        String opcion = "0";
        double resulrado = 0.0;
        double numero1, numero2;

        //Entrada
        menu = "MENU PRINCIPAL" + "\n" +
                "1) Suma" + "\n" +
                "2) Resta" + "\n" +
                "3) Dividir" + "\n" +
                "4) Multiplicar" + "\n" +
                "\n" +  "elegie un opcion";

        opcion = JOptionPane.showInputDialog(menu);


        numero1 = Double.parseDouble(JOptionPane.showInputDialog("INTRODUCE EL NUMERO 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("INTRODUCE EL NUMERO 2"));

        if (numero2>0.0){

        switch (opcion) {
            case "1":
                resulrado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "la suma es: " + resulrado);
                break;

            case "2":
                resulrado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "la resta es: " + resulrado);
                break;

            case "3":
                resulrado = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "la division es: " + resulrado);
                break;

            case "4":
                resulrado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "la multiplciacion es: " + resulrado);
                break;

            case "5":
                resulrado = numero1 % numero2;
                JOptionPane.showMessageDialog(null, "El modulo es: " + resulrado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "NO VALIDO");
        }
        }else{

            }

        }

    }
