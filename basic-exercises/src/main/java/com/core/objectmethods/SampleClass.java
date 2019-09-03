//package com.core.objectmethods;
//
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//
//import java.util.Objects;
//
//@AllArgsConstructor
//@NoArgsConstructor
//public class SampleClass {
//    String name;
//    double amount;
//    private String type;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SampleClass)) return false;
//        SampleClass that = (SampleClass) o;
//        return Double.compare(that.amount, amount) == 0 &&
//                Objects.equals(name, that.name) &&
//                Objects.equals(type, that.type);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, amount, type);
//    }
//
//    public static void main(String[] args) {
//        SampleClass income = new SampleClass("USD", 55., "");
//        SampleClass expense = new SampleClass("USD", 55., "");
//        System.out.println(expense.equals(income));
//    }
//}
