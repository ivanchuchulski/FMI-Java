package task3b_deckOfCards;

public class Card {
    private String face; // ace, deuce, three, four
    private String suit; // hearts, diamonds, clubs, spades

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }



    @Override
    public String toString() {
        return face + " of " + suit;
    }

    public String getFace() {
        return face;
    }

    public int getFaceNumber() {
        switch (this.face) {
            case "Ace" :
                return 0;
            case "Deuce" :
                return 1;
            default:
                return 0;
        }
    }

    public String getSuit() {
        return suit;
    }
}
