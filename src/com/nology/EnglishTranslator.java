package com.nology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class EnglishTranslator {
    public static String translateEnglish(String englishInput) {
        String[] arrayInput = englishInput.split("");
        ArrayList<String> translatedWord = new ArrayList<>();
        HashMap<String, String> englishAlphabet = new HashMap<>();

        englishAlphabet.put("a", ".-");
        englishAlphabet.put("b", "-...");
        englishAlphabet.put("c", "-.-.");
        englishAlphabet.put("d", "-..");
        englishAlphabet.put("e", ".");
        englishAlphabet.put("f", "..-.");
        englishAlphabet.put("g", "--.");
        englishAlphabet.put("h", "....");
        englishAlphabet.put("i", "..");
        englishAlphabet.put("j", ".---");
        englishAlphabet.put("k", "-.-");
        englishAlphabet.put("l", ".-..");
        englishAlphabet.put("m", "--");
        englishAlphabet.put("n", "-.");
        englishAlphabet.put("o", "---");
        englishAlphabet.put("p", ".--.");
        englishAlphabet.put("q", "--.-");
        englishAlphabet.put("r", ".-.");
        englishAlphabet.put("s", "...");
        englishAlphabet.put("t", "-");
        englishAlphabet.put("u", "..-");
        englishAlphabet.put("v", "...-");
        englishAlphabet.put("w", ".--");
        englishAlphabet.put("x", "-..-");
        englishAlphabet.put("y", "-.--");
        englishAlphabet.put("z", "--..");
        englishAlphabet.put(" ", " ");

        for ( String element : arrayInput ) {
            translatedWord.add(englishAlphabet.get(element));
        }
        return translatedWord.stream().map(Object::toString).collect(Collectors.joining(" "));
    }
}
