package ru.loginovskiy.algorithm.sorts;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {7,2,4,3,9,1,8,6,5,0};
        Sorts sort = new Sorts();
        System.out.println(Arrays.toString(arr));
        sort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
