package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       


        int total = 0;
        int adet=0;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bir say� giriniz : ");
        number = scanner.nextInt();

        while (number!=0){

            total = (number % 10)+total;
            number/=10;
            ++adet;
        }
        System.out.println("girilen say�n�n basamak say�lar� toplam� = " + total);
    }
}
