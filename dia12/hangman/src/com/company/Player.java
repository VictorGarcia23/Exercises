package com.company;
import java.util.Scanner;
public class Player {


    Scanner input = new Scanner(System.in);

    public char letra() {
        System.out.println("Bienvenido al juego del ahoracado(el que tengo aquí colgado)");
        System.out.println("Dame una letra: ");
        char laLetra = input.nextLine().charAt(0);
        return 'b';


    }
}
