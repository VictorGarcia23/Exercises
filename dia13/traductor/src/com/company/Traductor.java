package com.company;
import java.util.Scanner;
public class Traductor {
    private String[] español = new String[] {"casa" , "coche" , "pelota"};
    private String[] deutch = new String[] {"heim" , "auto" , "kügel"};

    public String traduccion() {

        Scanner input = new Scanner(System.in);
        System.out.println("Si desea traducir de español a Alemán , presiones el 1. Si quiere traducir del alemán al español presione 2.");
        int eleccion = input.nextInt();

        if (eleccion == 1 ) {
            System.out.println("las palabras disponibles son : 1.Casa 2.Coche 3.Pelota");
            int primeraPal = input.nextInt();
            if (primeraPal == 1) {
                System.out.println(deutch[0]);
            }
            if (primeraPal == 2) {
                System.out.println(deutch[1]);
            }
            if (primeraPal == 3 ) {
                System.out.println(deutch[2]);

            } else {
                System.out.println("en pruebas");
            }

        }


            return "hecho";

    }
}
