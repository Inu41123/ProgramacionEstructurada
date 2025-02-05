import javax.swing.*;

public class ControlCalif2 {

    public static void main(String[] args) {

        //declaraciond e variables
        double calif = 0.0;

        //entrada
      calif = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificaicon"));

      // 0.0 && 10

        //proceso
        if (calif>=0.0 && calif<=10.0){

            System.out.println("aprobado");

        }

        System.out.println("final");
    }


}
