package com.nology;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MorseTranslator {


    public static String translateMorse(String morseInput) {
        String[] arrayInput = morseInput.split(" ");
        ArrayList<String> translatedWord = new ArrayList<>();
        HashMap<String, String> morseAlphabet = new HashMap<>();

        morseAlphabet.put(".-", "a");
        morseAlphabet.put("-...", "b");
        morseAlphabet.put("-.-.", "c");
        morseAlphabet.put("-..", "d");
        morseAlphabet.put(".", "e");
        morseAlphabet.put("..-.", "f");
        morseAlphabet.put("--.", "g");
        morseAlphabet.put("....", "h");
        morseAlphabet.put("..", "i");
        morseAlphabet.put(".---", "j");
        morseAlphabet.put("-.-", "k");
        morseAlphabet.put(".-..", "l");
        morseAlphabet.put("--", "m");
        morseAlphabet.put("-.", "n");
        morseAlphabet.put("---", "o");
        morseAlphabet.put(".--.", "p");
        morseAlphabet.put("--.-", "q");
        morseAlphabet.put(".-.", "r");
        morseAlphabet.put("...", "s");
        morseAlphabet.put("-", "t");
        morseAlphabet.put("..-", "u");
        morseAlphabet.put("...-", "v");
        morseAlphabet.put(".--", "w");
        morseAlphabet.put("-..-", "x");
        morseAlphabet.put("-.--", "y");
        morseAlphabet.put("--..", "z");
        morseAlphabet.put("/", " ");

        for ( String element : arrayInput ) {
            translatedWord.add(morseAlphabet.get(element));
        }
        return translatedWord.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
