package ru.loginovskiy.algorithm.average;

public class Average
{
    static int[] arr = {25,45,43,23,12,14,0,2,11,54};
    public static void main(String[] args)
    {
        int summ=0;
        for (int i = 0; i < arr.length ; i++)
        {
            summ += arr[i];
        }
        float average = (float)summ/arr.length;
        System.out.println(average);
    }
}
