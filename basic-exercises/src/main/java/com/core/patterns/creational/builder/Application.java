package com.core.patterns.creational.builder;

import com.core.patterns.creational.builder.impl.CarBuilderImpl;
import com.core.patterns.creational.builder.impl.TruckBuilderImpl;
import com.core.patterns.creational.builder.products.Truck;

public class Application {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilderImpl carBuilder = new CarBuilderImpl();
        TruckBuilderImpl truckBuilder = new TruckBuilderImpl();

        director.constructSpecific(truckBuilder);
        Truck result = truckBuilder.getResult();
//        Car result = carBuilder.getResult();

        System.out.println(result);
    }
}
