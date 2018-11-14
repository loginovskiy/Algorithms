package ru.loginovskiy.algorithm.queue;

public class Main
{
    public static void main(String[] args)
    {
        int size = 4;
        Queue queue = new Queue(size);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.extract();
        queue.extract();
        queue.extract();
        queue.extract();
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.dispQueue();
    }
}
