package ru.loginovskiy.algorithm.heap2;

public class Heap
{
    private int[] heapArr;
    private static int heapSize = 0;
    public Heap(int arrSize)
    {
        heapArr = new int[arrSize+1];
    }

    private void swap(int i, int j)
    {
        int temp = heapArr[i];
        heapArr[i] = heapArr[j];
        heapArr[j] = temp;
    }

    private void insert(int val)
    {
        heapSize++;
        heapArr[heapSize-1] = val;
        shiftUp();
    }

    private int extract()
    {
        int temp = heapArr[0];
        heapArr[0] = heapArr[--heapSize];
        shiftDown();
        return temp;
    }

    private void shiftUp()
    {
        int i = heapSize-1;
        if(i==0)return;
        while(i>0 && heapArr[i] < heapArr[(i-1)/2])
        {
            swap(i,(i-1)/2);
            i=(i-1)/2;
        }
    }

    private void shiftDown()
    {
        int i=0;
        int left, right, j;
        while(2*i+1<heapSize)
        {
            left = 2*i+1;
            right = 2*i+2;
            j=left;
            if(right < heapSize && heapArr[right] < heapArr[left])
            {
                j=right;
            }
            if(heapArr[j] >= heapArr[i])break;
            swap(i,j);
            i=j;
        }
    }

    public void pSort(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++)
        {
            insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = extract();
        }
    }
}
