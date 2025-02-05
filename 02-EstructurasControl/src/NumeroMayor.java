import javax.swing.*;

public class NumeroMayor {
/*
Evaluar si un valor o un numeo es mayor a 10 utilizando el operador ternario (?)

(expresion)? parte ture : parte false
 */
    public static void main(String[] args) {

        //Declaracion de variables
        double numero = 0.0;
        String salida = " ";

        //Entrada
        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero"));

        // parte true                ||| Parte false
        salida = (numero > 10)?  "el numero0 es mayor a 10"  :  "el numero es menor a 10";

        JOptionPane.showMessageDialog(null, salida);


        if (!(numero > 10)){
            salida = "el numero0 es mayor a 10";
        }else{
            salida = "el numero es menor a 10";
        }

        JOptionPane.showMessageDialog(null, salida);

    }

}
