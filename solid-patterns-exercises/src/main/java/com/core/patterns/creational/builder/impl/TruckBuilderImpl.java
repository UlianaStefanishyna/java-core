package com.core.patterns.creational.builder.impl;

import com.core.patterns.creational.builder.Builder;
import com.core.patterns.creational.builder.products.Truck;

public class TruckBuilderImpl implements Builder {

    private final Truck truck;

    public TruckBuilderImpl() {
        this.truck = new Truck();
    }

    @Override
    public void setDoorsCount(int count) {
        this.truck.setDoorsCount(count);
    }

    @Override
    public void setRoofType(String roofType) {
        this.truck.setRoofType(roofType);
    }

    public Truck getResult() {
        return this.truck;
    }
}
