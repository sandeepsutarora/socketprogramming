package com.sutar.innovation.scjp;

class SuperClass{

    public int display(String str, Integer ... data) throws Exception
    {
        System.out.println("Super"+ str);
        return 1;
    }
}
class SubClass extends  SuperClass{
    public int display(String str, Integer ... data)
    {
        System.out.println("Super"+ str);
        return 1;
    }
}

public class ExceptionHanding {
    public static void main(String[] args) {
        int billion = 1_000_000_000;
        System.out.println(billion);
    }
}
