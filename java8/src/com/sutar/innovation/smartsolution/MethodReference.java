package com.sutar.innovation.smartsolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;


public class MethodReference {
 public static void main(String args[])
 {
        List<Integer> firstList = Arrays.asList(12,34,55,68,35,83,59,34,57);

 }


    public static boolean isMoreThanFifty(int n1, int n2)
    {
        return (n1 + n2 ) > 50;

    }

    public static List<Integer> findNumbers(List<Integer> list, BiPredicate<Integer, Integer> p)
    {
        List<Integer> newList = new ArrayList<>();
        for( Integer i: list)
        {
            if( p.test(i, i+10))
                newList.add(i);
        }
        return newList;
    }
}
