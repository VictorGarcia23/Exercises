package com.company;

import java.util.Random;

public class Orden {
    Random nRandom = new Random();

    private int[] array1;

    public Orden (int size) {
        array1 = new int[size];

    }
    public void print() {
        System.out.print( " [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]  +  "," );


        }
        System.out.println(" ] ");

    }
    public void ordenDeMiArray() {
            for (int i = 1; i <array1.length ; i++) {
                for (int j = 0; j <array1.length - 1 ; j++) {
                    if (array1[j] > array1[j + 1]) {
                        int array2 = array1[j + 1];
                        array1[j + 1] = array1[j];
                        array1[j] = array2;
                    }


                }

            }
        }
    public void mezcla() {
        for (int i = 0; i < array1.length ; i++) {
            array1[i] = nRandom.nextInt(100);

        }
    }

}








