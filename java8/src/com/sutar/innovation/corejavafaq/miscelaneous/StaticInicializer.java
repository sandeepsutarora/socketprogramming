package com.sutar.innovation.corejavafaq.miscelaneous;

public class StaticInicializer {

    {
        new Test();
        System.out.println("A ="+ Test.A +" , B = "+ Test.B     );

    }

    public static void main(String[] args) {
        new StaticInicializer();
    }

}
class Test{
    public static int A=5;
    public static final int B;
    static{
        if(A == 5)
            B = 10;
        else
            B=5;
    }
    public Test(){
        System.out.println("Constructor :");
    }
}

