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

    public String setCardValue(){

        int number = (int)((Math.random() * 4) +1);
       switch (number){
           case 1:
               cardValue = "Hearts";
                break;
           case 2:
               cardValue = "Spades";
               break;
           case 3:
               cardValue = "Diamonds";
               break;
           case 4:
               cardValue = "Clubs";

       }
       return cardValue;

    }

    public String getCardValue() {
        return cardValue;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(){

        int num = (int) ((Math.random() * 13) +1);

        if(num ==1){

            cardNumber = "Ace";
        } else if (num == 11){
           cardNumber =  "Jack";
        } else if (num == 12){
            cardNumber =  "Queen";
        }else if (num == 13){
            cardNumber =  "King";
        }  else {

            cardNumber = Integer.toString(num);
        }



    }


    public Cards makeOneCard(){
        Cards oneCard = new Cards();

      oneCard.setCardNumber();

      oneCard.setCardValue();

     return oneCard;

    }




    @Override
    public String toString() {
        return  cardNumber   + " " + cardValue  ;
    }
}
