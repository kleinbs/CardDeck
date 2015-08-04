package com.cards;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by scipio on 8/3/15.
 */
public class DeckTest {

    /**
     * Test the remainingCards method
     */
    @Test
    public void testRemainingCards(){

        Deck deck = new Deck();

        //Deck has remaining cards when initialized
        assertTrue(deck.RemainingCards() != 0);
        //Deck has 52 cards
        assertEquals(deck.RemainingCards(), 52);
        //remove 10 cards, ensure that there are 42 cards
        int i = 0;
        while(i < 10){
            deck.DrawCard();
            i++;
        }
        assertEquals(deck.RemainingCards(), 42);
        //Deck has cards
        while(i < 52){
            deck.DrawCard();
            i++;
        }
        assertEquals(deck.RemainingCards(), 0);
    }

    @Test
    public void testDrawCard(){

        Deck deck = new Deck();
        //check to see if deck starts correctly
        assertEquals(deck.DrawCard().toString(), "ACE of HEARTS");
    }
}
