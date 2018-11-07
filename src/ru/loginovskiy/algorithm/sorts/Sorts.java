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
        int begin = r;
        int end = l;
        if(begin == end)return;
        int midle = (begin + end)/2;
        sort(begin, midle);
        sort(midle+1, end);
        merge(begin, midle, midle+1, end);
    }
    private void merge(int fBegin, int fEnd, int sBegin, int sEnd)
    {
        int[] temp;
        int i=0;
        temp = new int[sEnd+1 - fBegin];
        int start = fBegin;
        while(fBegin<=fEnd && sBegin<=sEnd)
        {
            if(a[fBegin]<a[sBegin])temp[i++]=a[fBegin++];
            else temp[i++]=a[sBegin++];
        }
        while(fBegin<=fEnd)temp[i++] = a[fBegin++];
        while(sBegin<=sEnd)temp[i++] = a[sBegin++];
        System.arraycopy(temp,0, a, start, temp.length);
    }

    public void quickSort(int[] arr)
    {
        a = arr;
        int left, right, tgt;
        left = 0;
        tgt = a.length-1;
        right = tgt - 1;
        qs(left, right, tgt);
    }

    private void qs(int l, int r, int t)
    {
        if(l==r && a[l]>a[t])swap(l,t);
        if(l>=r)return;
        int left, right, tgt;
        left = l;
        right = r;
        tgt = t;

        while(left<right)
        {
            while(left<=tgt && a[left]<a[tgt])left++;
            while(right>left && a[right]>a[tgt])right--;
            if(left<right)swap(left,right);
        }
        if(left==right)swap(right,tgt);
        qs(l, right - 1, right-2);
        qs(right+1, t-1, t);
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