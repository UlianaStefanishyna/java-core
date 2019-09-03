//package com.core.oop.abstraction.sampleinterface;
//
//public interface SampleInterface {
//
//    /**
//     * static final by default. [MUST BE define here]
//     */
//    public static final String sampleConstantVariable = "PUBLIC CONSTANT IN THE INTERFACE";
//
//    /**
//     * public abstract by default. [MUST BE overridden]
//     */
//    public abstract void sampleAbstractMethod();
//
//    /**
//     * [MUST BE define here] Cannot be overridden
//     */
//    static void sampleStaticMethodInInterface() {
//        samplePrivateStaticMethod();
//        System.out.println("JAVA 8: static method of the interface." +
//                " Cannot be overridden by class which implement this interface");
//    }
//
//    default void sampleDefaultMethodInInterface() {
//        samplePrivateStaticMethod();
//        samplePrivateMethodInInterface();
//        System.out.println("JAVA 8: default method of the interface. Can be overridden");
//    }
//
//    void sampleMethodInInterface();
//
//    private void samplePrivateMethodInInterface() {
//        samplePrivateStaticMethod();
//        System.out.println("JAVA 9: private method of the interface");
//    }
//
//    private static void samplePrivateStaticMethod() {
//        System.out.println("private static");
//        sampleStaticMethodInInterface();
//    }
//
//
//    class Hidden {
//
//    }
//
//    /**
//     * interface does not allow to launch
//     */
////    static void main(String[] args) {
////        System.out.println("Hello from interface");
////    }
//}
