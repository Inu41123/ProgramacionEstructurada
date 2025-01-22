import javax.swing.*;

public class Expresiones {
    public static void main(String[] args) {

        //para las divisiones o en general si no trabajamos enterops
        // hay que ponerles .o para que funcione
          //   double e1 = 2+5*3.0/2.0+5*(2+2);
         //
        //    System.out.println(e1);

          //declaracione de variable
        double r = 0.0, r2 = 0.0, r3 = 0.0, r4 = 0.0, r5 = 0.0;
        double a = 0.0, y = 0.0, z = 0.0, x = 0.0, res = 0.0, b =0.0;


        //pedir datos
        a = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de b"));
        y = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de y"));
        z = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de z"));
        x = Double.parseDouble(JOptionPane.showInputDialog("introduce el valor de x"));

        String salida = "";

        //operaciones
        //expresion 1
        r = Math.pow(a + Math.pow(y,z+1)/ (x-1) , 2);
        //JOptionPane.showMessageDialog(null,"el resultado de la expresion 1 es: " + r);

        //expresion 2
        r2 = Math.pow( Math.sqrt(Math.pow(a-b,2))  /(4*x) , z-1);
        res = Math.pow((Math.sqrt(Math.pow((a-b),2)))/(4*(x)),(z-1));
        //JOptionPane.showMessageDialog(null,"el resultado de la expresion 1 es: 0" + res);

        //expresion 3
        r3 = 1.0/Math.sqrt(Math.pow(x,2)-(4*x));

        //expresion 4

        r4 = Math.pow(a + Math.pow(y, z+1),2);

        //expresion 5
        r5 = ((y)-3)/(Math.pow((x),5));
       // r5 = ((y)-3)/(Math.sqrt((x),5));


        salida = "El resultado de la expresion 1 es : "+r+
                   "\n el resultodo de la expresion 2 es : " + r2+
                "\n el resultodo de la expresion 2 es : " + res+
                       "\n el resultodo de la expresion 3 es : " + r3 +
                        "\n el resultodo de la expresion 4 es : " + r4+
                         "\n el resultodo de la expresion 5 es : " + r5;


        JOptionPane.showMessageDialog(null,salida);

    }
}
