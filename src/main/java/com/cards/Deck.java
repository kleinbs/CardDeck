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

    /**
     * Draws one card from the deck
     * @return returns a card, if no cards are left, it returns a null card.
     */
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

    /**
     * Shuffles the deck.
     */
    public void ShuffleDeck(){
        deckPlace = null;
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    /**
     * Returns the number of remaining cards
     * @return number of cards left in the deck
     */
    public int RemainingCards(){
        return cards.size();
    }

    /**
     * Initializes a new deck
     * @return returns a linked list of cards
     */
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

    /**
     * creates list of faces and suites
     */
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
