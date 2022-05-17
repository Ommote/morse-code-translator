package com.nology;


import java.util.HashMap;

public class MorseTranslator {
    public static void main1() {
        HashMap<String, String> morseAlphabet = new HashMap<>();

        morseAlphabet.put("a", ".-");
        morseAlphabet.put("b", "-...");
        morseAlphabet.put("c", "-.-.");
        morseAlphabet.put("d", "-..");
        morseAlphabet.put("e", ".");
        morseAlphabet.put("f", "..-.");
        morseAlphabet.put("g", "--.");
        morseAlphabet.put("h", "....");
        morseAlphabet.put("i", "..");
        morseAlphabet.put("j", ".---");
        morseAlphabet.put("k", "-.-");
        morseAlphabet.put("l", ".-..");
        morseAlphabet.put("m", "--");
        morseAlphabet.put("n", "-.");
        morseAlphabet.put("o", "---");
        morseAlphabet.put("p", ".--.");
        morseAlphabet.put("q", "--.-");
        morseAlphabet.put("r", ".-.");
        morseAlphabet.put("s", "...");
        morseAlphabet.put("t", "-");
        morseAlphabet.put("u", "..-");
        morseAlphabet.put("v", "...-");
        morseAlphabet.put("w", ".--");
        morseAlphabet.put("x", "-..-");
        morseAlphabet.put("y", "-.--");
        morseAlphabet.put("z", "--..");

        for ( String key : morseAlphabet.keySet() ) {
            System.out.println( key );
        }
    }

//scanner s = new Scanner(System.in);
//    input = s.next();


//    morseAlphabet.contains(translateThis);
// 1) input word
// 2) breakdown inputted word into letters
// 3) search hashmap for individual letters
// 4) return letters (key or pair)
// 5) return word in total
}
