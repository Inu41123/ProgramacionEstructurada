import javax.swing.*;

public class Examen {

    public static void main(String[] args) {
        //Entradas
        int divisor = 0, dividendo = 0, dividendo2 = 1,
                residuo = 0, conta = 1, res;
        int opcion = 0;
        char continuar = 0;

//Proceso
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog
                    (null,
                            "----- MENU -----\n"
                                    + "ELIGE UNA OPCION\n"
                                    + "1) Maximo comun dividor\n"
                                    + "2) Multiplicacion\n"
                                    + "3) SALIR\n"
                                    + "Para salir ingresa" +
                                       " culquier numero"));

            switch (opcion) {
                case 1:

                    //maximo comun divisor
                    divisor = Integer.parseInt(JOptionPane.showInputDialog
                            ("Ingresa el numero a mayor"));

                    dividendo = Integer.parseInt(JOptionPane.showInputDialog
                            ("Ingresa el numero a menor"));

                    if (dividendo > 0 && divisor > 0) {

                    if (divisor > dividendo) {

                    while (dividendo2<0){
                        residuo = divisor % dividendo;
                        JOptionPane.showMessageDialog
                                (null, residuo);
                        res = residuo;
                        divisor = dividendo;
                        dividendo2 = res % divisor;
                        JOptionPane.showMessageDialog
                                (null, dividendo2);

                    }

                    JOptionPane.showMessageDialog
                            (null,
                                    "El MAXIMO COMUN DIVISOR DEL RESIDUO es: " + dividendo2);

                    }else {

                        JOptionPane.showMessageDialog
                                (null,
                                        "el segundo numero tiene que ser el menor"+
                                        "Saliendo.......");
                    }


                    }else{
                        JOptionPane.showMessageDialog
                                (null,
                                        "hay un negativo \n"
                                + "PRIMERO: "+divisor + " "+ " " +"SEGUNDO: "+ dividendo +
                                        " \nSALIENDO.......");

                    }


                    break;


                case 2:

        //multiplicacion
        // Programa para calcular y mostrar la tabla de multiplicar de un número
        int numero = 0,  numero2 = 0 , num = 0,  producto = 0;
        String resultado = "";

        // Solicitar el número
        numero = Integer.parseInt(JOptionPane.showInputDialog
                ("ingrese un numero a multiplciar"));

        numero2 = Integer.parseInt(JOptionPane.showInputDialog
                ("ingrese un segundo numero a multiplicar"));

        num = numero2;
        // Calcular y concatenar la tabla de multiplicar
        for (int i = 1; i <= numero; i++) {
            producto += numero2;
            resultado += numero + " x " + i + " = " + producto + "\n";
        }

        // Mostrar la tabla de multiplicar

        JOptionPane.showMessageDialog
                (null,  "-----RESULTADO-----\n" + resultado);

                    break;

                case 3:
                    JOptionPane.showMessageDialog
                            (null, "\nSALIENDO......");
                    break;
                default:
                    JOptionPane.showMessageDialog
                            (null,
                                    "No hay opcion" + "\nSALIENDO......");
                    break;


            }

            continuar =
                    JOptionPane.showInputDialog
                            ("¿Desea repetir el programa? (s/n):")
                            .toLowerCase().charAt(0);

        } while (continuar == 's');

        JOptionPane.showMessageDialog(null, "FINALIZANDO......");

    }
}
