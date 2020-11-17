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
        los = rnd.nextInt(1000)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number from 1 to 1000");
        do {
            i++;
            System.out.println("Tell me your number: ");
            odpowiedz = scanner.nextInt();
            if(odpowiedz > los) {
                System.out.println("Unfortunatelly you did not guess. My number is lower.");
            } else if(odpowiedz <los){
                System.out.println("Unfortunatelly you did not guess. My number is higher.");

            }
        }while (odpowiedz != los);
        System.out.println("Congratulations, you guessed.");
        }
    }
