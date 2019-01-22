package com.company;

import java.util.ArrayList;



public class Deck extends Cards {


    //Im going to use DECK to make a hand instead
    //Going to make an array of 52 cards
    //Going to have a condition if there are two of the same
    //Going to save the cards to a deck.
    //Going to call the deck object in the program 4 times


    public void makeAHand(Cards myCard) {

        ArrayList<Cards> cardHand = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
         cardHand.add(myCard.makeOneCard());
        }


        System.out.println(cardHand);

        }



    }


