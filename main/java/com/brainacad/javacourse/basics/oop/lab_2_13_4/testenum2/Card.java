package com.brainacad.javacourse.basics.oop.lab_2_13_4.testenum2;

/**
 * @author Dmytro_Adonin
 * @since 8/25/16
 */
public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit suit, Rank rank) {
        cardSuit = suit;
        cardRank = rank;
    }

    @Override
    public String toString() {
        return cardRank + "_" + cardSuit;
    }

}
