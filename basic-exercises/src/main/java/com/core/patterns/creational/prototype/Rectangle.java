package com.core.patterns.creational.prototype;

import lombok.NoArgsConstructor;
import lombok.Setter;

//@ToString
@NoArgsConstructor
@Setter
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
