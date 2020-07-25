package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Orden instancia = new Orden(50);
        instancia.mezcla();
        instancia.ordenDeMiArray();
        instancia.print();

    }
}
