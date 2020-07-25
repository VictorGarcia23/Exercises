package com.company;
import java.util.Scanner;

public class Fifo {
    private  int[] datos = new int[]{1, 2, 3, 4, 5, 6, 7, 8};


    public int push(int value) {


        int[] copiaPush = new int[datos.length +1];
        copiaPush[0] = value;
        for (int i = 0; i < datos.length - 1; i++) {
            copiaPush[i + 1] = datos[i];


        }
        datos = copiaPush;
        return value;
    }

    public int pop() {
        int result = datos[datos.length - 1];
        int[] copiaPop = new int[datos.length - 1];
        for (int i = 0; i < copiaPop.length - 1 ; i++) {
            copiaPop[i] = datos[i];


        }
        datos = copiaPop;
        return result;


        }

        public void imprimr()
        {
            System.out.print("[");
            for (int i = 0; i <datos.length ; i++) {
                if (i < datos.length - 1) {
                    System.out.print(datos[i] );
                    System.out.print (" , ");

                }   else{
                    System.out.print(datos[i]);
                }
            }
            System.out.println("]");

        }
}







