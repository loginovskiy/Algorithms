package ru.loginovskiy.algorithm.fastsort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {23,20,98,6,34,5,15};
        FastSort sort = new FastSort();
        sort.qs(arr);
        System.out.println(Arrays.toString(arr));
    }
}
