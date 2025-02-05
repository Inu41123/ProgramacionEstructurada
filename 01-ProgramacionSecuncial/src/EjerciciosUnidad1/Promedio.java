package EjerciciosUnidad1;

import javax.swing.*;

/*
 Escribir un programa que calcula y muestra el promedio de los números enteros 1,
7, 9 y 34.
  */
public class Promedio {

         public static void main(String[] args) {
             // Definición de los números
             int numero1 = 1;
             int numero2 = 7;
             int numero3 = 9;
             int numero4 = 34;

             // Cálculo del promedio
             double promedio = (numero1 + numero2 + numero3 + numero4) / 4.0;

             // Mostrar el resultado
             JOptionPane.showMessageDialog(null,
                     "El promedio de los números 1, 7, 9 y 34 es: " + promedio);
         }


 }
