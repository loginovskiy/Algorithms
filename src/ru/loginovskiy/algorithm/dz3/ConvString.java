package ru.loginovskiy.algorithm.dz3;

public class ConvString
{
    private String str;
    private char[] stack;
    private int pointer;
    private int maxSize;
    private int items;

    ConvString(String str)
    {
        this.str = str;
        pointer = -1;
        stack = new char[str.length()];
        maxSize = str.length();
        items = 0;
    }

    public void revers()
    {
        for (int i = 0; i < str.length(); i++)
        {
            push(str.charAt(i));
        }

        for (int i = 0; i < stack.length ; i++)
        {
            System.out.print(pop());
        }
    }
    private boolean isFull()
    {
        return items == maxSize;
    }

    private boolean isEmpty()
    {
        return items == 0;
    }

    private void push(char val)
    {
        if(isFull())
        {
            char[] temp = new char[stack.length*2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }
        stack[++pointer] = val;
        items++;
    }

    private char pop()
    {
        try
        {
            if(isEmpty())throw new ArrayIndexOutOfBoundsException("Стек пуст");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stack is Empty");
            return 0;
        }
        items--;
        return stack[pointer--];
    }
}
