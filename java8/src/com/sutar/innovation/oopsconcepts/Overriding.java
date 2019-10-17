package com.sutar.innovation.oopsconcepts;


class Parent
{
    //first instance variable
    public String name  = "I am Parent";
    public static String working = "HardWork";

    @Override
    public String toString() {
        return this.name;
    }
    public static String toStringNew()
    {
        return "Parent";
    }
}
class Child extends  Parent
{
    public String name  = "I am Child";
    public static String working = "Softwork";
    @Override
    public String toString() {
        return this.name;
    }
    public static String toStringNew()
    {
        return "Child";
    }
}
public class Overriding {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parentChild = new Child();
        System.out.println("Prints Childs variable|| "+child.name +"     Prints Parents variable even though holding child Object" +parentChild.name);
        System.out.println("Static Variables of Respective class is pringing:  "+Child.working +"     " +Parent.working);
        System.out.println("Overriding method call at runtime: "+child +"     " +parentChild);
        System.out.println("Overriding doesn't work for Static methods too :"+Child.toStringNew() +"     " +Parent.toStringNew());








    }
}

