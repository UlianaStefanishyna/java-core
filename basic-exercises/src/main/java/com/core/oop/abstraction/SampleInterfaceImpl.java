package com.core.oop.abstraction;

public class SampleInterfaceImpl implements SampleInterface {
    @Override
    public void sampleAbstractMethod() {
        System.out.println(SampleInterface.sampleConstantVariable);
        SampleInterface.sampleStaticMethodInInterface();

    }

    @Override
    public void sampleDefaultMethodInInterface() {
        System.out.println(SampleInterface.sampleConstantVariable);
        SampleInterface.sampleStaticMethodInInterface();
    }

    @Override
    public void sampleMethodInInterface() {
        System.out.println(SampleInterface.sampleConstantVariable);
        SampleInterface.sampleStaticMethodInInterface();

    }
}
