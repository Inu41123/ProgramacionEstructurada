import javax.swing.*;

public class Ecuacion2 {
    public static void main(String[] args) {

        //Declaraciond e variables

        double s = 0.0, x = 0.0;
        int n = 0;
        int i = 0;
        //division simpre dobles
        double deno = 0.0;
        double subDeno = 0.0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces " +
                "que se realizara la ecuacion"));


        deno = 1.0;
        subDeno = 3.0;
        while (i < n){
        x = Double.parseDouble(JOptionPane.showInputDialog("Intruduce el valor de x: "));

        if (i%2 == 0) {

            s-= Math.pow(x, 3.0/subDeno)/deno;

        }else{
            s+= Math.pow(x, 3.0/subDeno)/deno;
        }
        deno+=2;
        subDeno+=3;
        i++;
        }

        JOptionPane.showMessageDialog
                (null, "El resultado es: " + s);

    }
}
