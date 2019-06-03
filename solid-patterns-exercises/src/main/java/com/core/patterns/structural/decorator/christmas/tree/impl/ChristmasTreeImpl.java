package com.core.patterns.structural.decorator.christmas.tree.impl;

import com.core.patterns.structural.decorator.christmas.tree.ChristmasTree;

public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
