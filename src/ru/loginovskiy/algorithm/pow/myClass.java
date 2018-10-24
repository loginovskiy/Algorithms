package ru.loginovskiy.algorithm.pow;

public class myClass
{
    public static void main(String[] args)
    {
        float val = 45;
        int degree = 4;
        System.out.println(pow(val, degree));
    }

    static float pow(float  val, int degree)
    {
        if(degree == 0) return 1;

        else if(degree%2 == 0) return pow(val * val, degree/2);

        else return val * pow(val, --degree);
    }
}
