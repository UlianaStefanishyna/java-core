package com.core.oop.abstraction.sampleabstract;

import static java.lang.System.*;

public abstract class SampleAbstractClass {

    protected abstract void sampleProtectedAbstractMethod();

    static void sampleStaticMethodWithImplementation() {
        out.println("abstract method can have static non-abstract method with implementation with any of accessibility");
    }

    private void samplePrivateNonAbstractMethod() {
        out.println("non-abstract method");
    }

    void sampleNonAbstractMethod() {
        samplePrivateNonAbstractMethod();
    }

    /**
     * can be launched
     */
    public static void main(String[] args) {
        out.println("Hello from abstract class");
    }
}