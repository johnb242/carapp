package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

       // Car auto = new Car();

        //auto.setColor("red");
        //auto.setMake("honda");

        //System.out.println(auto.getColor());
       // System.out.println(auto.getMake());

        Car auto2 = new Car();
        auto2.setColor("green");
        auto2.setMake("Tesla");
        auto2.setYear(2019);
        auto2.setSpeed(85);
        auto2.setModel("spartan");
        System.out.println(auto2.getColor());
        System.out.println(auto2.getMake());
        System.out.println(auto2.getYear());
                System.out.println(auto2.getSpeed());
                        System.out.println(auto2.getModel());
        ArrayList<Car>cars = new ArrayList<Car>();
        Car car = new Car();
        cars.add(car);
        for(Car car: cars){
            System.out.println(car.getDescription);
        }
    }
}
