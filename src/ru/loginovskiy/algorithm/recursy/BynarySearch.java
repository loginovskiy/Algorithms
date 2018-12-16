package ru.loginovskiy.algorithm.recursy;

public class BynarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,4,6,13,28,29,44,56,77,100};
        System.out.println(recursySearch(0, arr.length, arr, 76));
    }
    public static int bynarySearch(int[] a, int search)
    {
        int left,right,target,middle;
        left = 0;
        right = a.length - 1;
        target = search;
        do
        {
            middle = (left+right)/2;
            if(target == a[middle])return middle;
            if(target<a[middle])right=middle;
            else left = middle;
        }while(right - left!=1 && a[middle]!=target);
        return -1;
    }

    public static int recursySearch(int l, int r, int[]a, int search)
    {
        if(r-l==1 && a[(r+l)/2]!=search) return -1;
        int left = l;
        int right = r;
        int middle = (left+right)/2;
        if(a[middle] == search)return middle;
        if(a[middle]<search)left = middle;
        else right = middle;
        return recursySearch(left,right,a,search);
    }
}
