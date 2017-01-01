package com.brainacad.javacourse.basics.oop.lab_2_15_5.testmap1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dmitry Adonin
 * @since 27/08/16.
 */
public class MyTranslator {

    private Map<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        String ru = dictionary.get(en);
        return ru == null ? en : ru;
    }

}
