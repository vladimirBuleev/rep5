package StackAndQueue;

public class Card {
    String suit;
    String rang;

    public Card(String suit, String rang) {
        this.suit = suit;
        this.rang = rang;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }
}
