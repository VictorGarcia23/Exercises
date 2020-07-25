package com.company;

public class CreateArray {
    private int[][] arrayEnteros;

    public CreateArray(){
        init();
    }
    public void init(){
        int valor = 0;
        arrayEnteros = new int[4563][4145563];
        for (int i = 0; i < arrayEnteros.length ; i++) {
            for (int j = 0; j < arrayEnteros[i].length ; j++) {
                arrayEnteros[i][j] = valor++;

            }

        }
    }

    public void draw(){
        System.out.println();
        System.out.println();
        for (int i = 0; i < arrayEnteros.length; i++) {
            for (int j = 0; j < arrayEnteros[i].length; j++) {
                System.out.print(arrayEnteros[i][j] + "   ");
            }
            System.out.println();
        }
    }}
