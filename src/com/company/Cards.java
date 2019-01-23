package com.company;

public class Cards {

    String cardValue;
    String cardNumber;

    public Cards() {
    }

    public Cards(String cardValue, String cardNumber) {
        this.cardValue = cardValue;

        this.cardNumber = cardNumber;
    }


    public void setCardValue(String cardValue) {

        int number = (int) ((Math.random() * 4) + 1);

        switch (number) {
            case 1:

                this.cardValue = "Hearts";
                break;

            case 2:

               this.cardValue = "Spades";
                break;

            case 3:

                this.cardValue = "Diamonds";
                break;

            case 4:

                this.cardValue = "Clubs";

        }


    }

    public String getCardValue() {
        return cardValue;
    }

    public void setCardNumber(String cardNumber) {

        int num = (int) ((Math.random() * 13) + 1);

        if(num ==1){

            this.cardNumber = "Ace";

        } else if (num == 11){

           this.cardNumber =  "Jack";

        } else if (num == 12){

            this.cardNumber =  "Queen";

        }else if (num == 13){

            this.cardNumber =  "King";

        }  else {

            this.cardNumber = Integer.toString(num);
        }


    }

    public String getCardNumber() {
        return cardNumber;
    }


    public Cards makeOneCard(){

        Cards oneCard = new Cards();

       oneCard.setCardValue(cardValue);

       oneCard.setCardNumber(cardNumber);

     return oneCard;

    }


    @Override
    public String toString() {
        return  cardNumber   + " " + cardValue  ;
    }
}
