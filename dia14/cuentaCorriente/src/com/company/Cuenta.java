package com.company;
import java.util.Scanner;
public class Cuenta {

    Scanner input = new Scanner(System.in);
    double retirada = 0;
    double total = 1;
    double ingreso = 0;
    public double ingresarDinero (){
        return ingreso;
    }
    public double retirarDinero(){
        return retirada;
    }
    public void printPantalla(){
        System.out.println("Bienvenido a su cuenta, dispone de"  + total  +  "€");
        System.out.println("si desea retirar dinero pulse 1, en cambio si desea ingresar pulse 2");
        int opciones = input.nextInt();
        if ( opciones == 1){
            System.out.println("¿que cantidad de dinero desea retirar?");
            retirada = input.nextDouble();
            total = total - retirada;
            System.out.println("Su saldo es de "  +  total  +  "€");
            if (retirada > total){
                System.out.println("No tiene suficiene saldo.");

            }

            }
           else {
            System.out.println("¿que cantidad desa ingresar?");
            ingreso = input.nextDouble();
            total = ingreso + total;
        }
           }
    }





