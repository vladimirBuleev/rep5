package StackAndQueue;

import java.util.Stack;

public class StackCardGame {
    public Stack<Card> deck;

    public Card getCard() {
        return deck.pop();
    }

    public Card showTopCard() {
        return deck.peek();
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }

    public Stack<Card> getDeck() {
        return deck;
    }
}
