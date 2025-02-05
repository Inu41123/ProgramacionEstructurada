import javax.swing.*;

public class ControlCalif3 {

    public static void main(String[] args) {
        //declaraciond e variables
        double calif = 0.0;

        //entrada
        calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificaicon"));

        //proceso
      
        if (calif>=0.0 && calif>=7.0 && calif<=10.0){
            System.out.println("aprobado");

        } else {
            System.out.println("Reprobado");
        }
        System.out.println("final");
        }
}
