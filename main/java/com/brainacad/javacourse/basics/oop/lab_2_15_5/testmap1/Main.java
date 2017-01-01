package com.brainacad.javacourse.basics.oop.lab_2_15_5.testmap1;

import java.util.Scanner;

/**
 * @author Dmitry Adonin
 * @since 27/08/16.
 */
public class Main {

    public static void main(String[] args) {

        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");
        myTranslator.addNewWord("caught", "поймал");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input words to translate:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        for (String word : words) {
            System.out.print(myTranslator.translate(word) + " ");
        }

    }

}
