package com.core.patterns.creational.prototype;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}