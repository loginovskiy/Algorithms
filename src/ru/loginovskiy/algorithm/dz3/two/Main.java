package ru.loginovskiy.algorithm.dz3.two;

public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck(5);
        deck.insertLeft(1);
        deck.insertLeft(1);
        deck.insertRight(-1);
        deck.insertRight(-1);
        deck.insertRight(-1);
        deck.insertRight(-1);
        deck.insertLeft(1);
        deck.insertLeft(1);
        deck.insertRight(-1);
        deck.insertRight(-1);
        deck.insertRight(-1);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);
        deck.insertLeft(2);

        for (int i = 0; i < 10 ; i++)
        {
            System.out.print(deck.extractLeft() + " ");
        }
        System.out.println();
        //deck.insertLeft(2);
        deck.insertLeft(1000);
        deck.showDeck();
    }
}
