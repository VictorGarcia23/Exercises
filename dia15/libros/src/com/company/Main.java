package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dame un valor ");
        int multiplicador = input.nextInt();
        System.out.println("dame otro valor ");
        int multiplicando = input.nextInt();
        int resultado = 0;
        if (multiplicador >0 && multiplicando >0){
            for ( int i = multiplicador; i >= 1 ; i = i/2){
                if ( i%2 != 0) {
                    resultado += multiplicando;
                    multiplicando = multiplicando * 2;
            }   else {
                    multiplicando = multiplicando * 2;
                }

        }

        }

        System.out.println(resultado);
    }}
