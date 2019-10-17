package com.sutar.innovation.corejavafaq.miscelaneous;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {

    public static void main(String[] args) {
        List<Car> myCars = new ArrayList<>(10);
        myCars.add(new Car("Red Passion","Huyndai"));
        myCars.add(new Car("Red Passion","Jaguar"));
        myCars.add(new Car("Black","Limozine"));
        myCars.add(new Car("Purple","Farari"));
        List<Car> familyCars = new ArrayList<>(10);
        familyCars = deepCopy(myCars);
        for(Car car : myCars)
        {
            for(Car car1 : familyCars)
            {
                if (car == car1)
                    System.out.println(car);
            }
        }
        System.out.println("All Cars are different objects");

    }

    private static List<Car> deepCopy(List<Car> listCars)
    {
        List<Car> copiedList = new ArrayList<>(10);
        for(Car car: listCars)
        {
            Car carCoplied = new Car();
            carCoplied.setColor(car.getColor());
            carCoplied.setMake(car.getMake());
            copiedList.add(carCoplied);
        }
        return copiedList;
    }
}


class Car{
    private String color;
    private String make;
    public Car(){}
    public Car(String color, String make)
    {
        this.color = color;
        this.make= make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}