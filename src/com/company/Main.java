package com.company;

public class Main {

    public static void main(String[] args) {
	//Nightmare Mode: Assignment #4 - Card Deck
        //
        //Write a program that deals a random hand of (5) cards to each of (4) players.
        // Assume a standard 52-card deck.
        //Think about how to use classes and objects to simplify this exercise.
        // For example, how might you structure a Card object? What properties should it have?
        // What about a Deck object?

        Cards oneCard = new Cards();
        Deck newDeck = new Deck();

        System.out.println("First players hand: ");
        newDeck.makeAHand(oneCard);

        System.out.println("Second Players hand: ");
        newDeck.makeAHand(oneCard);

        System.out.println("Third players hand: ");
        newDeck.makeAHand(oneCard);

        System.out.println("Fourth Players hand: ");
        newDeck.makeAHand(oneCard);



    }
}
