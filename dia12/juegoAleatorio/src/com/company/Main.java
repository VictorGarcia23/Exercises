package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Aleatorio aleatorio = new Aleatorio();
        aleatorio.number = aleatorio.batidora;

        Scanner input = new Scanner(System.in);
        System.out.println("Adivina el número: ");
        int value = input.nextInt();

        if ( value == aleatorio.number){
            System.out.println("los has encontrado de pura coña");

        }   else{
            for (int i = 0; i < 9; i++) {
                if ( value == aleatorio.number) {
                    System.out.println("los has encontrado de pura coña");
                    break;

                }   if ( value < aleatorio.number) {
                        System.out.println(" el numero es mas grande: ");
                        value = input.nextInt();
                }   if ( value > aleatorio.number) {
                        System.out.println("el numero es mas pequeño");
                        value = input.nextInt();
                }

            }


        }   boolean found = false;
            for (int i = 0; i <= 9; i++) {
                if (value == aleatorio.number){
                    found = true;
                }

        }   if (found){
                System.out.println("elemento encontrado");


    }   else{
            System.out.println("eres un puto LOOSER");
        }
}}
