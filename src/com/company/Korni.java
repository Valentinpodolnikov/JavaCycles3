package com.company;

import java.util.Random;

public class Korni {
    public static void main(String[] args) {
        Random random = new Random();

        while (true){

        int x = random.nextInt(51); //0..50 случайное число
        Random random2 = new Random();
        int y = random2.nextInt(51); //0..50 случайное число
        Random random3 = new Random();
        int z = random3.nextInt(51); //0..50 случайное число


        double c = Math.pow(x,2);
        double d = Math.pow(y,2);
        double e = Math.pow(z,2);
        double f = c+d;


            if(e==f){
                System.out.println(x+" "+y+" "+z);


            }


        }

    }
}
