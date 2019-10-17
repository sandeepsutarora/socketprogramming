package com.sutar.innovation.corejavafaq.string;



public class StringRegularExpression {
    private static String pattern = "[,\\s]+";

    public static void main(String[] args) {
        String vehicle = "Car,Jeep, Wagon Schooter    Truck,   Van";
        String [] result = vehicle.split(pattern);
        for(String str: result)
        {
            System.out.print(str+",");
        }
        System.out.println(result.toString());

    }

}
