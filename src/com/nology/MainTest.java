package com.nology;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Translate hello")
    void translateHello() {
        assertEquals("hello", MorseTranslator.translateMorse(".... . .-.. .-.. ---"));
    }

    @Test
    @DisplayName("Translate olivia")
    void translateOlivia() {
        assertEquals("olivia", MorseTranslator.translateMorse("--- .-.. .. ...- .. .-"));
    }

    @Test
    @DisplayName("Translate nology")
    void translateNology() {
        assertEquals("nology", MorseTranslator.translateMorse("-. --- .-.. --- --. -.--"));
    }

    @Test
    @DisplayName("Translate sentence")
    void translateSentence() {
        assertEquals("hello friendly world", MorseTranslator.translateMorse(".... . .-.. .-.. --- / ..-. .-. .. . -. -.. .-.. -.-- / .-- --- .-. .-.. -.."));
    }
}