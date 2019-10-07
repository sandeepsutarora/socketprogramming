package com.sutar.innovation.collection;


import java.util.*;

public class ComparatorExample {
    private static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        students.add(new Student(19,1,"Sachin"));
        students.add(new Student(19,1,"Suresh"));
        students.add(new Student(13,1,"Akash"));
        students.add(new Student(16,1,"Dhanaji"));
        students.add(new Student(10,1,"Jaggu"));
        students.add(new Student(11,1,"Mahesh"));
        Collections.sort(students);
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("---------------Sorting By Name------------------ ");
        Collections.sort(students,new SortByName());
        for(Student stud: students)
        {
            System.out.println(stud);
        }
    }

}

class Student implements Comparable<Student>
{
     int age;
     String name;
     int heigth;
    public Student(){}
    public Student(int age, int heigth, String name)
    {
        this.age=age;
        this.heigth=heigth;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
    @Override
    public String toString()
    {
        return "Name: "+ name +" Age: "+age+ " heightL "+ heigth;
    }
}

class SortByName implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);

    }

}

class SortByHeigth implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}