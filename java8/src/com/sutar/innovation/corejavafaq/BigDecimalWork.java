package com.sutar.innovation.corejavafaq;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalWork {


    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("2512");
        decimal = decimal.add(BigDecimal.valueOf(1000));
        decimal = decimal.multiply(BigDecimal.valueOf(233));
        System.out.println(decimal);

        MyBox box = new MyBox();
        String str = "hello";
        List<String> list = new ArrayList<>();
        list = Arrays.asList("first","second","third");
        ListIterator li = list.listIterator();
        System.out.println(li instanceof List);
        System.out.println(li instanceof Iterator);
        System.out.println(li instanceof ListIterator);
        String str1 = "Java programming practice along with good understanding of java memory structure";
        for(String token: str1.split("/n"))
        {
            System.out.println(token);
        }



    }
}

class Box
{
    int b, w;
    Box(int x, int y)
    {
        b= x; w=y;
        System.out.println("My Box: ");

    }
}
class MyBox extends Box{
    MyBox(){
        super(3,2);
    }
}

