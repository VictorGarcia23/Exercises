package com.company;

public class CreateTable {
    private boolean[][] arrayBolean;

    public CreateTable(){
        init();
    }
    public void init(){
        arrayBolean = new boolean[3][3];
        for (int i = 0; i < arrayBolean.length ; i++) {
            for (int j = 0; j < arrayBolean[i].length ; j++) {
                arrayBolean[i][j] = false;
                arrayBolean[1][1] = true;

            }

        }
    }

    public void draw(){
        System.out.println();
        System.out.println();
        for (int i = 0; i < arrayBolean.length; i++) {
            for (int j = 0; j < arrayBolean[i].length; j++) {
                System.out.print(arrayBolean[i][j] + " ");
            }
            System.out.println();
    }
}}
