package com.core.patterns.structural.decorator.christmas.tree.impl;

import com.core.patterns.structural.decorator.christmas.tree.ChristmasTree;
import com.core.patterns.structural.decorator.christmas.tree.TreeDecorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}