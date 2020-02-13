package task3b_deckOfCards;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Handler;

public class DeckOfCards {
    private final int NUMBER_OR_CARDS = 52;

    private static String[] faces = { "Ace", "Deuce", "Three",
                                    "Four", "Five", "Six",
                                    "Seven", "Eight", "Nine",
                                    "Ten", "Jack", "Queen", "King" };
    private static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    private int currentCardIndex;
    private Card[] deck;
    private Random randomNumbers;


    public DeckOfCards() {


        currentCardIndex = 0;
        deck = new Card[NUMBER_OR_CARDS];
        randomNumbers = new Random();

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(faces[i % faces.length], suits[i / faces.length]);
        }
    }

    public void shuffle() {
        currentCardIndex = 0;

        for (int firstCardIndex = 0; firstCardIndex < deck.length; firstCardIndex++) {
            int secondCardIndex = randomNumbers.nextInt(NUMBER_OR_CARDS);

            Card temp = deck[firstCardIndex];
            deck[firstCardIndex] = deck[secondCardIndex];
            deck[secondCardIndex] = temp;
        }
    }

    public Card dealOneCard() {
        if (currentCardIndex >= deck.length) {
            return null;
        }
        else {
            return deck[currentCardIndex++];
        }
    }

    private HashMap<String, Integer> countFacesInHand(Card[] hand) {
        HashMap<String, Integer> facesCounter = new HashMap<>();

        for (Card card : hand) {
            int counter = facesCounter.containsKey(card.getFace()) ? facesCounter.get(card.getFace()) : 0;

            facesCounter.put(card.getFace(), counter + 1);
        }

        return facesCounter;
    }
}
