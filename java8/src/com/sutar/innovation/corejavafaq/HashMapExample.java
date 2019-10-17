package com.sutar.innovation.corejavafaq;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        hashMap();
    }


    public static void hashMap()
    {
        Map<Integer, Student> students = new HashMap<>();
        Student s = new Student("Sandeep Sutar",38,5.7);
        students.put(1, s);
        students.put(null, new Student("Anand Nalawade ",39,5.9));
        students.put(2, new Student("Vikas Patil    ",35,5.5));
        students.put(3, new Student("Amol Patole    ",30,5.10));
        students.put(4, new Student("Shushil Patil  ",39,6.2));
        students.put(4, new Student("Shushil Dhod  ",39,6.2));
        students.put(null, new Student("Anurag ",39,5.9));
        System.out.println("Size:       "+students.size());

        System.out.println("Passing null value returns Object:   "+students.get(null));
        //System.out.println("Adding another object with null key, overrite old object");
        for(Integer x : students.keySet())
        {
            System.out.println(students.get(x));
        }
        System.out.println("------------HashMap Contains Key 3 ------------"+ students.containsKey(3));
        System.out.println("------------HashMap Contains Value  ------------"+ students.containsValue(new Student("Sandeep Sutar",38,5.7)));
        System.out.println("------------HashMap Contains Value  ------------"+ students.containsValue(s));
        students.remove(null);
        System.out.println("Removing object using NULL key ..........");
        System.out.println("Showing in curly Bracket: "+ students);
        System.out.println("Showing in squar Bracket: "+students.entrySet());
        System.out.println("putAll   ");
        Collection col = students.values();
        System.out.println("values return entire object"+col);
        System.out.println("========================   How Map.Entry<Integer,Student>  Works  ===============");

        for (Map.Entry<Integer,Student> entry: students.entrySet())
        {
            System.out.println(entry);
        }

    }
}




class Student
{
    private String name;
    private Integer age;
    private double height;
    public Student()
    {

    }
    public Student(String name,int age, double height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public String toString(){
        return this.name+", "+this.age+" ,"+this.height;
    }
}