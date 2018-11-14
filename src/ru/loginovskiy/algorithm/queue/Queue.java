package ru.loginovskiy.algorithm.queue;

import java.util.Arrays;

public class Queue
{
    int[] queue;
    int maxSize;
    int head;
    int tail;
    int items;
    Queue(int size)
    {
        maxSize = size;
        queue = new int[maxSize];
        tail = -1;
        head = 0;
        items = 0;
    }

    private boolean isFull()
    {
        return items == maxSize;
    }

    private boolean isEmpty()
    {
        return items == 0;
    }

    public void insert(int val)
    {
        if(isFull())
        {
            maxSize *= 2;
            int[] temp = new int[maxSize];
            if (head < tail)
            {
                System.arraycopy(queue, 0, temp, 0, queue.length);
            }
            else
            {
                System.arraycopy(queue, 0, temp, 0, tail + 1);
                System.arraycopy(queue, head, temp, maxSize - (queue.length - head), queue.length - head);
                head = maxSize - (queue.length - head);
            }
            queue = temp;
        }
        if(tail+1 == maxSize)tail = -1;
        queue[++tail] = val;
        items++;
    }

    public int extract()
    {
        if(isEmpty()) throw new RuntimeException("Очередь пуста");
        if(head+1 == maxSize)head = 0;
        int temp = queue[head++];
        items--;
        return temp;
    }

    public void dispQueue()
    {
        System.out.println(Arrays.toString(queue));
    }
}
