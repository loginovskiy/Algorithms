package ru.loginovskiy.newpackage.sortings;
import java.util.Arrays;
public class Sorts
{
    private static int pointer;
    public static void main(String[] args)
    {
        int[] arr = {9,3,2,1,4,6,5,7,8,0};
        showArray(arr);
        piramideSort(arr);
        showArray(arr);
    }

    public static void bubleSort(int[] arr)
    {
        int[] array = arr;
        for (int i = 0; i < array.length ; i++)
        {
            for (int j = 1; j < array.length ; j++)
            {
                if(array[j]<array[j-1])swap(array,j,j-1);
            }
        }
    }
    private static void swap(int[] arr, int i, int j)
    {
         int temp = arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }

    private static void showArray(int[] a)
    {
        System.out.println(Arrays.toString(a));
    }

    public static void selectSort(int[] arr)
    {
        int[] array = arr;
        int min;
        for (int i = 0; i < array.length; i++)
        {
            min = i;
            for (int j = i; j < array.length; j++)
            {
                if (array[min] > array[j]) min = j;
            }
            swap(array, i, min);
        }
    }

    public static void insertSort(int[] arr)
    {
        int[] array = arr;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i; j >= 0 ; j--)
            {
                if(array[j]>array[j+1])swap(array, j, j+1);
            }
        }
    }

    public static void piramideSort(int[] arr)
    {
        int[] array = arr;
        int[] heap = new int[arr.length];
        pointer = 0;
        for (int i = 0; i < heap.length; i++)
        {
            insert(heap, array[i]);
        }

        for (int i = 0; i < heap.length ; i++)
        {
            array[i] = extract(heap);
        }
    }
    private static void insert(int[] a, int val)
    {
        pointer++;
        a[pointer-1] = val;
        if(pointer-1 == 0)return;
        shiftUp(a);
    }

    private static int extract(int[] a)
    {
        int temp = a[0];
        a[0] = a[--pointer];
        shiftDown(a);
        return temp;
    }

    private static void shiftUp(int[] a)
    {
        int tp=pointer-1;
        while(a[tp]<a[(tp-1)/2] & tp>0)
        {
            swap(a, tp, (tp-1)/2);
            tp = (tp-1)/2;
        }
    }

    private static void shiftDown(int[] a)
    {
        int tp,i, temp;
        tp=i=0;
        int left = tp*i+1;
        int right = tp*i+2;
        while(a[tp]>a[tp*i+1] && tp*i+1 < pointer && tp*i+2 < pointer)
        {
            temp = left;
            if(a[temp]>a[right])temp = right;
            if(a[tp]>a[temp])swap(a, tp, temp);
            tp=temp;
            i++;
        }
    }
}
