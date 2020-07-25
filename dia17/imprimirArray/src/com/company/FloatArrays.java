package com.company;
import java.util.Random;
public class FloatArrays {
    Random random = new Random();
    float[][] miArray;
    public FloatArrays(){
        arrayRandom();
    }

    public void arrayRandom() {
        miArray = new float[5][5];
        for (int i = 0; i < miArray.length ; i++) {
            for (int j = 0; j < miArray[i].length ; j++) {
                miArray[i][j] = random.nextFloat() * 50;

            }

        }

    }
    public void imprimir(){
        for (int i = 0; i < miArray.length ; i++) {
            for (int j = 0; j < miArray[i].length ; j++) {
                System.out.print(miArray[i][j]  +  "  " );

            }

        }

    }

}
