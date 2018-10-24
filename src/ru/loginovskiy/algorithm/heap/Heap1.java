package ru.loginovskiy.algorithm.heap;

public class Heap1
{
    int[] heapArr;
    int heapSize;
    public Heap1(int len)
    {
        heapArr = new int[len];
        heapSize = 0;
    }

    public void insert(int val)
    {
        heapSize++;
        heapArr[heapSize-1] = val;
        shifUp(heapSize - 1);
    }

    public int extract()
    {
        int temp = heapArr[0];
        heapArr[0] = heapArr[heapSize - 1];
        heapSize--;
        shiftDown();
        return temp;
    }

    private void shifUp(int i)
    {
        if(i==0) return;
        while(i>0 && heapArr[i]< heapArr[(i-1)/2])
        {
            swap(i, (i-1)/2);
            i=(i-1)/2;
        }
    }

    private void shiftDown()
    {
        int i=0;
        int left, right, j;
        while(2*i+1 < heapSize)
        {
            left = 2 * i + 1;
            right = 2 * i + 2;
            j = left;
            if (right < heapSize & heapArr[right] < heapArr[left])
            {
                j = right;
            }
            if (heapArr[i]<=heapArr[j])break;
            swap(i,j);
            i=j;
        }
    }

    private void swap(int i, int j)
    {
        int temp = heapArr[i];
        heapArr[i] = heapArr[j];
        heapArr[j] = temp;
    }
}
