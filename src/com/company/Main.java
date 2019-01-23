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

        //create a card object to use within the CardHand object
        Cards oneCard = new Cards();

        //creating a card hand object to call the make a hand method
        CardHand newHand = new CardHand();


        for(int i = 1; i <= 4; i++){

        System.out.print("\nPlayer "+ i + " hand : ");

        newHand.makeAHand(oneCard);

        }


    }
}
