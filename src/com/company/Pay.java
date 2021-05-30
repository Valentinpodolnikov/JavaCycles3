package com.company;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        int zarplata;
        int sum = 0;
//        int sumRab = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("Введите зарплату " + i + "-го сотрудника за " + j + "-й месяц: ");
                zarplata = input.nextInt();

                sum += zarplata;

//                sumRab = zarplata
//
//
//                System.out.println("Зарплата, полученная за квартал " + i + "м работником: " + sumRab);

            }


        }
        System.out.println("Общая сумма, выплаченная за квартал всем работникам: " + sum);

    }
}
