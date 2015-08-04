# CardDeck
###Create a deck with 52 playing cards.

This is a library that creates a deck of 52 cards. To initalize a deck, simply import the project and create a new deck like so.

```java
Deck deck = new Deck();
```

This will initalize a deck. The deck starts out ordered by suits in the following order; *HEARTS, DIAMONDS, SPADES, CLUBS*, and faces ordered from ACE to KING. The deck can be randomized the follwoing way.
```java
deck.ShuffleDeck();
```

Running this previous code will now give you a shuffled deck. However, cards cannot be added to the deck, they can only be removed. To retrieve a card from the deck do the following.

```java
Card card = deck.DrawCard();
```

The card is now in your posession and removed from the deck. When there are no cards left in the deck, drawing the card will just return a null card. You can check the current deck size like so

```java
deck.RemainingCards();
```
That should get you started.
