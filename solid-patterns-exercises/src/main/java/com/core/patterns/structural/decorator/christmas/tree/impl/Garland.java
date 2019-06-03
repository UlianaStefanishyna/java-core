package com.core.patterns.structural.decorator.christmas.tree.impl;

import com.core.patterns.structural.decorator.christmas.tree.ChristmasTree;
import com.core.patterns.structural.decorator.christmas.tree.TreeDecorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
