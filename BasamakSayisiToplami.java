package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       


        int total = 0;
        int adet=0;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bir sayý giriniz : ");
        number = scanner.nextInt();

        while (number!=0){

            total = (number % 10)+total;
            number/=10;
            ++adet;
        }
        System.out.println("girilen sayýnýn basamak sayýlarý toplamý = " + total);
    }
}
