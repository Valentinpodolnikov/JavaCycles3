package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 5; i <= 9; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.printf("%-4d",i);
            }
            System.out.println();
        }



    }
}
