package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class CardHand extends Cards {

 //Using this to create a Card Hand object that will add 5 cards to an array list

    public CardHand() {
        super();
    }

    public void makeAHand(Cards myCard) {

        ArrayList<Cards> cardDeck = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

         cardDeck.add(myCard.makeOneCard());


        }

        for (Cards cards : cardDeck) {
           System.out.print(cards + "  ");
        }

       // System.out.println(cardDeck);

        }



    }


