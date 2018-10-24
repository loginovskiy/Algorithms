package ru.loginovskiy.algorithm.merge;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {2,10,1,6,5,9,7,3,4,8};
        Sort srt = new Sort();
        srt.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
