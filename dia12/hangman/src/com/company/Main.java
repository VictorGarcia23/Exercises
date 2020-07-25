package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
    Arrays palabraSeleccionada = new Arrays();
    Player letraSeleccionada = new Player();


    letraSeleccionada.letra();


        int life = 10;
        boolean acierto = true;
        int index = 0;
        for ( int i = 0; i < palabraSeleccionada.SoloCaracter.length;i++){
            if (letraSeleccionada.letra() == palabraSeleccionada.SoloCaracter[i]) {
                System.out.print(palabraSeleccionada.SoloCaracter[i]);

            }   else {
                    System.out.print("_");
                    life--;
                    
            }
        }

    }
}
