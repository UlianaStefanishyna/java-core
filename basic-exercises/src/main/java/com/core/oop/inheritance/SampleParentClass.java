package com.core.oop.inheritance;

/**
 * 'final' class cannot be extended
 * 'final' method cannot be overridden'
 */
public class SampleParentClass {
    public final void printShouldNotBeOverriden() {
        System.out.println("sentence from parent entity");
    }

    public void print() {
        System.out.println("overridable method");
    }
}
