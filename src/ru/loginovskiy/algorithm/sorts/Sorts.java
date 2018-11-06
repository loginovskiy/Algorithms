package ru.loginovskiy.algorithm.sorts;

import java.util.Arrays;

public class Sorts
{
    private int[] a;
    private int[] heap;
    private int heapSize;

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
            for(int j=i+1; j > 0 && a[j-1] > a[j]; j--)
            {
                swap(j-1,j);
            }
//            int j=i+1;
//            while(j>0 && a[j-1] > a[j])swap(j-1,j--);
        }
    }

    public void heapSort(int[] arr)
    {
        a = arr;
        heap = new int[a.length];
        heapSize = 0;
        for (int i = 0; i < a.length; i++)
        {
            insert(a[i]);
        }
        System.out.println(Arrays.toString(heap));
        for (int i = 0; i < a.length; i++)
        {
            a[i]=extract();
        }
    }
    private void insert(int val)
    {
        heapSize++;
        heap[heapSize-1] = val;
        shiftUp();
    }

    private void shiftUp()
    {
        if(heapSize-1 == 0)return;
        int i = heapSize - 1;
        while(i>0 && heap[i]<heap[(i-1)/2])
        {
            swaph(i,(i-1)/2);
            i = (i-1)/2;
        }
    }

    private int extract()
    {
       int temp = heap[0];
       heap[0] = heap[heapSize - 1];
       shiftDown();
       return temp;
    }

    private void shiftDown()
    {
        int left,right, i, j;
        i=0;
        while(2*i+1<heapSize)
        {
            left = 2 * i + 1;
            right = 2 * i + 2;
            j = left;
            if (right < heapSize && heap[right] < heap[left])
            {
                j = right;
            }
            if(heap[j] < heap[i])swaph(i,j);
            i=j;
        }
    }

    public void mergeSort(int[] arr)
    {
        a = arr;
        int right, left, i;
        right = 0;
        left = a.length - 1;
        sort(right, left);
    }

    private void sort(int r, int l)
    {
        int right = r;
        int left = l;
        int midle = (right + left)/2;

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

    private void swaph(int i, int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
