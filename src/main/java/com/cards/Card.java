package com.cards;

/**
 * Created by scipio on 8/2/15.
 */
public class Card implements IFace, ISuit {

    private String face;
    private String suit;

    public String getFace() {
        return null;
    }

    public String getSuit() {
        return null;
    }

    public Card(CardBuilder cardBuilder){
        this.face = cardBuilder.innerFace;
        this.suit = cardBuilder.innerSuit;
    }

    public String toString(){
        return face + " of " + suit;
    }

    protected static class CardBuilder{

        private String innerFace;
        private String innerSuit;

        protected CardBuilder face(String innerFace){
            this.innerFace = innerFace;
            return this;
        }

        protected CardBuilder suit(String innerSuit){
            this.innerSuit = innerSuit;
            return this;
        }

        protected Card build(){
            return new Card(this);
        }
    }
}
