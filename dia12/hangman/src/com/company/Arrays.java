package com.company;

import java.util.Random;

public class Arrays {
    String[] original = new String[] { "constantinopla" , "esqueleto" , "espantapajaros"};
    Random arrayRandom = new Random();
    public char[] SoloCaracter = original[arrayRandom.nextInt(original.length)].toCharArray();

}
