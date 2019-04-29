package com.core.patterns.creational.builder.impl;

import com.core.patterns.creational.builder.Builder;
import com.core.patterns.creational.builder.products.Car;

public class CarBuilderImpl implements Builder {

    private final Car car;

    public CarBuilderImpl() {
        this.car = new Car();
    }

    @Override
    public void setDoorsCount(int count) {
        this.car.setDoorsCount(count);

    }

    @Override
    public void setRoofType(String roofType) {
        this.car.setRoofType(roofType);
    }

    public Car getResult() {
        return this.car;
    }
}
