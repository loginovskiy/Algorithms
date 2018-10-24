package ru.loginovskiy.algorithm.merge;

class Sort
{
    int[] temp;

    public void sort(int[] a, int b, int e)
    {
        int begin,end,midle,i;
        begin = b;
        end = e;
        if(begin == end) return;
        midle = (begin + end)/2;
        sort(a, begin, midle);
        sort(a, midle+1, end);
        merge(a, begin, midle, midle+1, end);
    }
    public void merge(int[] a, int fBegin, int fEnd, int sBegin, int sEnd)
    {
        temp = new int[sEnd+1 - fBegin];
        int start = fBegin;
        int i = 0;
        while(fBegin <= fEnd && sBegin <= sEnd)
        {
            if (a[fBegin] < a[sBegin])temp[i++] = a[fBegin++];
            else temp[i++] = a[sBegin++];
        }
        while(fBegin<=fEnd)temp[i++] = a[fBegin++];
        while(sBegin<=sEnd)temp[i++] = a[sBegin++];
        System.arraycopy(temp, 0, a, start, temp.length);
    }
}