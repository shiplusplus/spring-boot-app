package com.shivangi.demo;

public interface Basic {

    int maths(int a, int b);

    default int subtraction(int a,int b)
    {
        return a-b;
    }

}
