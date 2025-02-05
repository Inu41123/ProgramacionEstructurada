import javax.swing.*;
import java.util.function.DoublePredicate;

public class EstructurasControlParte1 {

    public static void main(String[] args) {
        //declaracion de variables
        String opcion = "";
        String menu = "A) JUEGO" + "\n" +
                "B) FRUTERIA" + "\n" +
                "C) LABORATORIO" + "\n" +
                "D) SALIR " + "\n" +
                "Elegir opcion";

        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion){
            case "A":
                //llamar al metodo
              jugar();
                break;

            case "B":
                //

                double cantidadKilos = 0;
                double precio = 0.0;
                String resultado = "";
                precio = Double.parseDouble
                        (JOptionPane.showInputDialog("introduce el precio de lsa apples"));

                cantidadKilos = Double.parseDouble
                        (JOptionPane.showInputDialog("introduce el Total de kilos de apples"));

                if (cantidadKilos >= 0.0 && precio > 0.0){
                    if(cantidadKilos >= 0.0 && cantidadKilos <= 2.0){
                        resultado = "el total a pagar sin descuentos es: " + (cantidadKilos * precio);

                    } else if (cantidadKilos>= 2.01 && cantidadKilos <= 5.0) {
                        double descuento = (cantidadKilos * precio) * 0.10;
                        resultado = "El total a pagar con un descuento (10%)" + descuento + " es " +
                                ((cantidadKilos * precio) - descuento);

                    } else if (cantidadKilos >= 5.01 && cantidadKilos <= 10.0) {
                        double descuento = (cantidadKilos * precio) * 0.15;
                        resultado = "El total a pagar con un descuento (15%)" + descuento + " es " +
                                ((cantidadKilos * precio) - descuento);

                    } else if (cantidadKilos >= 10.01 && cantidadKilos <= 20.0) {
                        double descuento = (cantidadKilos * precio) * 0.20;
                        resultado = "El total a pagar con un descuento (20%)" + descuento + " es " +
                                ((cantidadKilos * precio) - descuento);
                    }

                    JOptionPane.showMessageDialog(null, resultado);

                }else{
                    if (cantidadKilos<0.0){
                        JOptionPane.showMessageDialog(null, "La cantidad de kilos no puede ser negativo ni cero");
                    }

                    if (precio <0.0){
                        JOptionPane.showMessageDialog(null, "El precio no puede ser negativo ni cero");
                    }
                }



                    break;

            case "C":
                break;

            case "D":
                JOptionPane.showMessageDialog(null, "FINALIZADO");
                break;

            default:
                JOptionPane.showMessageDialog(null, "FINALIZADO");


        }



    }

    public static void jugar(){
        String pregunta = "¿Colon descubrio america?";
        String resp = JOptionPane.showInputDialog(pregunta + "SI/NO");


        if(resp.equalsIgnoreCase("SI")) {
            resp = JOptionPane.showInputDialog("La independencia de mexico fue en 1810? SI/NO");

            if(resp.equalsIgnoreCase("SI")) {
                resp = JOptionPane.showInputDialog("The doors era un grupo de rock americano? SI/NO");

                if(resp.equalsIgnoreCase("SI")) {
                    JOptionPane.showInputDialog(null,"Has ganado");



                } else{
                    JOptionPane.showMessageDialog(null, "PERDISTE");
                }

            } else{
                JOptionPane.showMessageDialog(null, "PERDISTE");
            }

        } else{
            JOptionPane.showMessageDialog(null, "PERDISTE");
        }
    }

}
