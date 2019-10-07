package com.sutar.innovation.scjp;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public void display(Integer a)
    {
        System.out.println("Integer :"+a);
    }
    public void display(int a)
    {
        System.out.println("Int :"+a);
    }
    public void display(Number a)
    {
        System.out.println("Number :"+a);
    }
    public void display(String a)
    {
        System.out.println("String :"+a);
    }
    public void display(Object a) throws Exception
    {
        System.out.println("Object :"+a);
    }
}

class B extends  A
{
    public void display(Object a)
    {
        System.out.println("Object B :"+a);
    }
}

public class Overloading {
    //Identifier starts with _ or $ is valid. Identifier cannot be keywor and cannot start with number
    private String _$; //valid Identifier
    private String $7;//valid Identifier
    //private String #x; // invalidt Identifier
    //private String do;//Invalid Identifier
    public static void main(String[] args) {
        B a = new B();

        a.display(new StringBuffer("1"));
    }
}
