package ru.loginovskiy.algorithm.recursy.pow;

public class Pow
{
    public static void main(String[] args)
    {
        System.out.println(pow(16.3f,3));
    }

    public static float pow(float val, int degree)
    {
        if(degree == 0)return 1f;
        else if(degree % 2 == 0) return pow(val*val, degree/2);
        else return val*pow(val, degree - 1);
    }
}
