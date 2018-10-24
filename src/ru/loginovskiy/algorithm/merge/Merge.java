package ru.loginovskiy.algorithm.merge;

import java.util.Arrays;

public class Merge
{
    int[] arr1 = {2,5};
    int[] arr2 = {3,4};
    int[] arr3;

    int first, second;

    Merge()
    {
        first = second = 0;
        arr3 = new int[arr1.length + arr2.length];
    }

    public void arrMerge()
    {
        int i = 0;
        while (i < arr3.length)
        {
            if (first < arr1.length & second < arr2.length)
            {
                if(arr1[first] < arr2[second])
                {
                    arr3[i++] = arr1[first];
                    first++;
                }
                else
                {
                    arr3[i++] = arr2[second];
                    second++;
                }
            }
            if(first == arr1.length | second == arr2.length)break;
            //i++;
        }
        while (i<arr3.length)
        {
            if (second < arr2.length)
            {
                if(second >= arr2.length) break;
                arr3[i++] = arr2[second++];

            }
            else if(first < arr1.length)
            {
                if(first >= arr1.length) break;
                arr3[i++] = arr1[first++];
            }
        }
    }

    public void show()
    {
        System.out.println(Arrays.toString(arr3));
    }
}
