package ru.loginovskiy.algorithm.heap;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {3,1,18,24,4,5,9,7,22,8};
        Heap1 heap1 = new Heap1(arr.length);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++)
        {
            heap1.insert(arr[i]);
        }
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]= heap1.extract();
        }
        System.out.println(Arrays.toString(arr));
    }
}
