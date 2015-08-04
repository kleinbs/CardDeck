package com.table;

import com.cards.Deck;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertTrue(deck.RemainingCards() != 0);
        //Deck has 52 cards
        Assert.assertEquals(deck.RemainingCards(), 52);
        //remove 10 cards, ensure that there are 42 cards
        int i = 0;
        while(i < 10){
            deck.DrawCard();
            i++;
        }
        Assert.assertEquals(deck.RemainingCards(), 42);
        //Deck has cards
        while(i < 52){
            deck.DrawCard();
            i++;
        }
        Assert.assertEquals(deck.RemainingCards(), 0);
    }

    @Test
    public void testDrawCard(){

        Deck deck = new Deck();
        //check to see if deck starts correctly
        Assert.assertEquals(deck.DrawCard().toString(), "ACE of HEARTS");
    }
}
