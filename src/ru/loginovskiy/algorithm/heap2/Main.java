package ru.loginovskiy.algorithm.heap2;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {24,13,1,2,8,11,15,3,6,5,7,12,10,16,17,20,22,14,18,23,21,19,4,9};
        Heap heap = new Heap(arr.length);
        System.out.println(Arrays.toString(arr));
        heap.pSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
