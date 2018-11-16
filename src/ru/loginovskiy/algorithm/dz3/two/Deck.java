package ru.loginovskiy.algorithm.dz3.two;

import java.util.Arrays;

public class Deck
{
    int items;
    int maxSize;
    int left;
    int right;
    int[] deck;

    Deck(int size)
    {
        maxSize = size;
        items = 0;
        deck = new int[maxSize];
        left = maxSize/2;
        right = maxSize/2 - 1;
    }

    private boolean isFull()
    {
        return items == maxSize;
    }

    private boolean isEmpty()
    {
        return items == 0;
    }

    private void expansion()
    {
        int[]temp = new int[maxSize];
        if(left<right)
        {
            System.arraycopy(deck, 0, temp, maxSize - deck.length/2, deck.length);
        }
        else
        {
            System.arraycopy(deck, 0, temp, 0, right + 1);
            System.arraycopy(deck, left, temp, maxSize - (deck.length - left), deck.length - left);
            left = maxSize - (deck.length - left);
        }
        deck = temp;
    }

    public void insertLeft(int val)
    {
        if(isFull())
        {
            maxSize*=2;
            expansion();
        }
        if(left-1==-1)left = maxSize;
        deck[--left]=val;
        items++;
    }
    public void insertRight(int val)
    {
        if(isFull())
        {
            maxSize*=2;
            expansion();
        }
        if(right+1==maxSize)right = -1;
        deck[++right]=val;
        items++;
    }

    public int extractLeft()
    {
        if(isEmpty())throw new RuntimeException("Дек пуст");
        if(left == maxSize)left=0;
        int temp = deck[left++];
        items--;
        return temp;
    }

    public int extractRight()
    {
        if(isEmpty())throw new RuntimeException("Дек пуст");
        if(right == -1)right=maxSize - 1;
        int temp = deck[right--];
        items--;
        return temp;
    }
    public void showDeck()
    {
        System.out.println(Arrays.toString(deck));
    }
}
