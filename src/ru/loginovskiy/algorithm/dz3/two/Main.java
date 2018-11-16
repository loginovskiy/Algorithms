package ru.loginovskiy.algorithm.dz3.two;

public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck(5);
        deck.insertLeft(1);
        deck.insertRight(-1);
        deck.insertRight(-2);
        deck.insertRight(-3);
        deck.insertRight(-4);
        deck.insertRight(-5);
        deck.insertLeft(2);
        deck.insertLeft(3);
        deck.insertLeft(4);
        deck.insertLeft(5);
        deck.insertLeft(6);
        deck.extractRight();
        deck.extractRight();
        deck.extractRight();
        deck.insertRight(0);
        deck.insertRight(0);
        deck.showDeck();
    }
}
