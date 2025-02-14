import javax.swing.*;
import java.awt.*;

public class ProgrmasCiclos1 {
    public static void main(String[] args) {
        //Declaracion de Variables
        String opcion= "", menu ="";
        boolean sentinel = true;

           //Creacion del menu
           menu = "Menu principal\n" +
                   "1) Promedio Calificaciones\n" +
                   "2) Vendedores (While)\n" +
                   "3) Tienda (do while)\n" +
                   "4) SALIR \n" +
                   "ELEGIR OPRCION \n";

        do {
           opcion = JOptionPane.showInputDialog(menu);

           switch (opcion) {
               case "1":
                  calcularPromedio();
                   break;

               case "2":

                   String nombre = "", salida = "";
                   double numVetnas = 0.0, sueldoBase = 0.0, comisioon = 0.0, SueldoTotal = 0.0;
                   int numVendedores = 0;


                   numVendedores = Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de vendedores"));
                   sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("intodcue el sueldo base"));

                   salida = "Nombre \t\t\t\tComision\t\t\tSueldo Total\n";

                   int i = 1;
                   while (i<=numVendedores){
                       nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE DEL VENDEDOR" + i);
                       salida+= nombre + "\t\t\t\t" + comisioon + "\t\t\t\t" + SueldoTotal + "\n";

                       i++;
                   }
                   JOptionPane.showMessageDialog(null,salida);


                   break;

               case "3":
                   JOptionPane.showMessageDialog(null, "opcion 3");

                   break;

               case "4":
                   JOptionPane.showMessageDialog(null, "ADIOS, EL PROGRAMA HA TERMINADO" +
                           " CTM (CUIDA TU MUNDO)");
                   sentinel = false;

                   break;

               default:
                   JOptionPane.showMessageDialog(null, "OPCION NO VALIDA MMWEBO");
           }

       }while(sentinel);


    }

    //METODOS
    //Metodo 1
    public static void calcularPromedio() {
        JOptionPane.showMessageDialog
                (null, "opcion 1");

        int numCalif = 0;
        double calif = 0.0;
        double promedio = 0.0;

        //Solicitar el nmero de calificaciones
        numCalif = Integer.parseInt
                (JOptionPane.showInputDialog("introduce el numero de calificaciones"));

        for (int i = 1; i <= numCalif; i++) {
            //Solicitar calificacion
            calif = Double.parseDouble
                    (JOptionPane.showInputDialog("Introduce la cilifacion" + i));
            //Acumular califiaciones
            promedio = promedio += calif;
        }

        promedio/= numCalif;
        JOptionPane.showMessageDialog
                (null, "El prmedio del alumno es:" + promedio);
    }

    //Metodo 2


    //Metodo 3


    //Metodo 4

}
