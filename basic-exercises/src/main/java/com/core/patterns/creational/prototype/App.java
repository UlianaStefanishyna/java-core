package com.core.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(4);
        rectangle.setWidth(6);
        Shape clonenRec = rectangle.clone();

        shapes.add(rectangle);
        shapes.add(clonenRec);

        shapes.forEach(System.out::println);
//        System.out.println(shapes);

    }
}
