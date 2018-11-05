package ru.loginovskiy.algorithm.sorts;

public class Sorts
{
    int[] a;

    public void bubleSort(int[] arr)
    {
        a = arr;
        for(int i = 0; i<a.length; i++)
        {
            for(int j=1; j<a.length; j++)
            {
                if(a[j]<a[j-1])swap(j,j-1);
            }
        }
    }

    public void selectSort(int[] arr)
    {
        a = arr;
        int min;
        for(int i = 0; i < a.length; i++)
        {
            min = i;
            for (int j = i+1; j <a.length ; j++)
            {
                if(a[j]<a[min]) min = j;
            }
            swap(i,min);
        }
    }

    public void insertSort(int[] arr)
    {
        a = arr;
        for(int i = 0; i<a.length - 1; i++)
        {
            for(int j=i+1; j > 0; j--)
            {
                if(a[j-1] > a[j])swap(j-1,j);
                else break;
            }
        }
    }

    public void heapSort(int[] arr)
    {

    }

    public void mergeSort(int[] arr)
    {

    }

    public void quickSort(int[] arr)
    {

    }

    private void swap(int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
