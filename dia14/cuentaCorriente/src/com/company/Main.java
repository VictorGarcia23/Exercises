package com.company;

public class Main {

    public static void main(String[] args) {
	Cuenta instancia = new Cuenta();

	while (instancia.total != 0){
	    instancia.printPantalla();
	}
    if (instancia.total <= 0){
        System.exit(0);
    }

    }
}
