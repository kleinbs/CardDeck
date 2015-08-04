package com.cards;

import java.util.*;


/**
 * Created by scipio on 8/2/15.
 */
public final class Deck {

    private static List<String> suit;
    private static List<String> face;

    private List<Card> cards;

    private Iterator deckPlace;

    public Deck(){
        this.cards = NewDeck();
    }

    public Card DrawCard(){

        if(deckPlace == null)
            deckPlace = cards.iterator();

        if(deckPlace.hasNext()){
            Card currentCard = (Card)deckPlace.next();
            deckPlace.remove();
            return currentCard;
        } else
            return null;
    }

    public void ShuffleDeck(){
        deckPlace = null;
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    public int RemainingCards(){
        return cards.size();
    }

    private static List<Card> NewDeck(){
        initializeDeck();
        List<Card> cards = new LinkedList();
        for(int i = 0; i < suit.size(); i++){
            for(int j = 0; j < face.size(); j++){
                Card card = new Card.CardBuilder().suit(suit.get(i)).face(face.get(j)).build();
                cards.add(card);
            }
        }
        return cards;
    }

    private static void initializeDeck(){
        suit = new ArrayList();
        face = new ArrayList();

        suit.add("HEARTS");
        suit.add("DIAMONDS");
        suit.add("SPADES");
        suit.add("CLUBS");

        face.add("ACE");
        face.add("2");
        face.add("3");
        face.add("4");
        face.add("5");
        face.add("6");
        face.add("7");
        face.add("8");
        face.add("9");
        face.add("10");
        face.add("JACK");
        face.add("QUEEN");
        face.add("KING");
    }
}
