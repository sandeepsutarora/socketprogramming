package com.sutar.innovation.corejavafaq;

import java.util.*;
import java.util.HashMap;

//To create objects of a class no arg constructor is needed.
//We can have abstract class without any. We can create object of abstract class providing defination of all abstract methods in the
//curly bracket. If we don't have any abstract method then also we need curly bracket when creating instance of abstract class.
//Similary we can create object of instance of interfaces using anonymous class.
//
public class Constructor {

    public Constructor(){}
    public Constructor(int val)
    {
        System.out.println(val);
    }

    public static void main(String[] args) {
        Constructor cn = new Constructor();
        List<String> list = Arrays.asList("first","second","test","cricket");
        List<String> list1 [] = new ArrayList[5];
        list1[0] =  new ArrayList<>();
        list1[0].add("first");


        String color[] = {};//,"red","green","yellow","orange"};
        Arrays.sort(color);

        int s1= Arrays.binarySearch(color,"sandeep");

        System.out.println(list);
        System.out.println(s1);
        System.out.println(color.length);



    }
}


/*                  practice */

 class Employee
{
    HashMap<String,String>  props = new HashMap<>();
    public void method() {
        props.put("key45", "Some Value");
        props.put("Key12", "Some Other Value");
        props.put("key39", "Yet another value");
        Set s = props.keySet();
        s = new TreeSet(s);
    }
    






}