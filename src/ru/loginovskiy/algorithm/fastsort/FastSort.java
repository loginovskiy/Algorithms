package ru.loginovskiy.algorithm.fastsort;

public class FastSort
{
    private int[] arr;
    public void qs(int[] a)
    {
        arr = a;
        quickSort(0, arr.length - 2, arr.length - 1);
    }

    public void quickSort(int l, int r, int t)
    {
        int left,right,target;
        left = l;
        right = r;
        target = t;
        if(l>=r)return;
        while(left < right)
        {
            while (left < target && arr[left] < arr[target])left++;
            while (right > left && arr[right] > arr[target])right--;
            if(right>left)swap(left,right);
        }
        if(right==left)swap(right,target);
        quickSort(l, right - 1, right);
        quickSort(right, t-1, t);

    }
    public void swap(int l, int r)
    {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
