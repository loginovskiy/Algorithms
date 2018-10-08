package ru.loginovskiy.algorithm.pow;

public class Pow
{
    private float val;
    private int pow_n;

    public Pow(float val, int n)
    {
        this.val = val;
        this.pow_n = n;
    }

    public float pow()
    {
        float f = val;
        for (int i = 0; i < pow_n; i++)
        {
            val *= f;
        }
        return val;
    }

    public void showVal()
    {
        System.out.println(val);
    }
}
