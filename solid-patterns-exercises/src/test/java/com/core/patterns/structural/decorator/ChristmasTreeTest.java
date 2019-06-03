package com.core.patterns.structural.decorator;

import com.core.patterns.structural.decorator.christmas.tree.ChristmasTree;
import com.core.patterns.structural.decorator.christmas.tree.impl.BubbleLights;
import com.core.patterns.structural.decorator.christmas.tree.impl.ChristmasTreeImpl;
import com.core.patterns.structural.decorator.christmas.tree.impl.Garland;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasTreeTest {

    @Test
    void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), "Christmas tree with Garland");

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(), "Christmas tree with Garland with Garland with Bubble Lights");
    }
}