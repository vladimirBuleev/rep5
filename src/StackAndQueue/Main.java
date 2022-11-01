package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Card> deck = new Stack<>();
        deck.push(new Card("Spades", "Ace"));
        deck.push(new Card("Spades", "Seven"));
        deck.push(new Card("Spades", "King"));
        deck.push(new Card("Clubs", "Six"));
        deck.push(new Card("Hearts", "Queen"));
        deck.push(new Card("Diamonds", "Jack"));
        StackCardGame game = new StackCardGame();
        game.setDeck(deck);
        Card one = game.getCard();
        System.out.println(one);
        System.out.println(game.showTopCard());
        deck.push(new Card("Spades", "jack"));
        System.out.println(game.showTopCard());
        Card two = game.getCard();
        Card three = game.getCard();
        System.out.println(game.showTopCard());

        System.out.println("/////////////////////////////////////////////////////////");

        Queue<Card> queue = new LinkedList<>();
        queue.add(new Card("Spades", "Ace"));
        queue.add(new Card("Spades", "Seven"));
        queue.add(new Card("Clubs", "Six"));
        queue.add(new Card("Hearts", "Queen"));
        queue.add(new Card("Diamonds", "Jack"));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);


    }

}
