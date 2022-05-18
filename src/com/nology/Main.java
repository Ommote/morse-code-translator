package com.nology;

import java.util.Scanner;

import static com.nology.EnglishTranslator.translateEnglish;
import static com.nology.MorseTranslator.translateMorse;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 1 to translate Morse Code to English\nSelect 2 to translate English to Morse Code: ");
        int userChoice = scanner.nextInt();

        if(userChoice == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter something to translate from Morse Code to English: ");
            String input = scanner1.nextLine();
            System.out.println(translateMorse(input));
        } else {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please enter something to translate from English to Morse Code: ");
            String input1 = scanner1.nextLine();
            System.out.println(translateEnglish(input1));
        }

    }
}
