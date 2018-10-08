package ru.loginovskiy.algorithm.min;

public class Min
{
    private static int[] arr = {2,-2,16,43,5,7,1,-45,212,1,1,2};
    private static int count = 0;
    private static int min;
    public static void main(String[] args)
    {
        min = arr[count];
        min_search();
        System.out.println(min);
    }
    public static void min_search()
    {
        if(count==arr.length-1) return;
        if(arr[count]<min) min=arr[count];
        count++;
        min_search();
    }
}
