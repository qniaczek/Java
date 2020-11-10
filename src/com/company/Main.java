package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int los;
        int odpowiedz;

        Random rnd = new Random();
        los = rnd.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczbe od 1 do 100!");
        do {
            i++;
            System.out.println("Podaj liczbe: ");
            odpowiedz = scanner.nextInt();
            if(odpowiedz > los) {
                System.out.println("niestety nie zgadles! Moja liczba jest mniejsza.");
            } else if(odpowiedz <los){
                System.out.println("niestety nie zgadles! moja liczba jest wieksza");

            }
        }while (odpowiedz != los);
        System.out.println("Brawo odgadles za " +i+ " razem!");
       // for(int j = 100; j >0; j--){
        //   System.out.println(rnd.nextInt(10)+1);
        }
    }
