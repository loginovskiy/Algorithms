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
        deck.showDeck();
    }
}
