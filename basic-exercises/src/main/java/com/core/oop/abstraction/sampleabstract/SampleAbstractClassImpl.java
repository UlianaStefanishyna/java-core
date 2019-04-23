package com.core.oop.abstraction.sampleabstract;

public class SampleAbstractClassImpl extends SampleAbstractClass {

    @Override
    protected void sampleProtectedAbstractMethod() {
        System.out.println("implemented method");
    }

    public static void main(String[] args) {
        SampleAbstractClass.sampleStaticMethodWithImplementation();

        SampleAbstractClass sampleAbstractClass = new SampleAbstractClassImpl();

        sampleAbstractClass.sampleProtectedAbstractMethod();

        sampleAbstractClass.sampleNonAbstractMethod();
    }
}
