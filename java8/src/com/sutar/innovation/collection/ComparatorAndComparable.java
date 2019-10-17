package com.sutar.innovation.collection;

import java.util.Arrays;
import java.util.Date;
public class ComparatorAndComparable {
    public static void main(String[] args) {
        //create Array of Employee and sort
        Employee employees[] = new Employee[10];
        employees[0] = new Employee("Jack Maa");
        employees[1] = new Employee("Milton Friedman");
        employees[2] = new Employee("Denis Ritche");
        employees[3] = new Employee("Nicolas Tesla");
        employees[4] = new Employee("Guido Van Rossum");
        employees[5] = new Employee("Go programming Language");
        employees[6] = new Employee("Implement compare method if impmeneting Comparator");
        employees[7] = new Employee("Comparable needs to implement CompareTo method");
        employees[8] = new Employee("String has already implemented Comparable interface");
        employees[9] = new Employee("Okay");
        for (Employee employee: employees)
        {
            System.out.println(employee);
        }
        System.out.println("===============================After sorting employees===============================");
        Arrays.sort(employees);
        for (Employee employee: employees)
        {
            System.out.println(employee);
        }

    }
}


class Vehicle
{

}

class Employee extends Person implements  Comparable<Employee>
{
    public Employee(){}
    public Employee(String name)
    {
        this.name=name;
    }

    public int compare(Employee first, Employee second )
    {
        return first.name.compareTo(second.name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}

abstract class Person
{
    String name;
    Date dateOfBirth;
    public String toString()
    {
        return "Name :"+ name + " Date Of Birth"+ dateOfBirth;
    }
}
