//package com.core.objectmethods;
//
//import lombok.AllArgsConstructor;
//
//import java.util.Objects;
//
////@AllArgsConstructor
//class WrongVoucher extends SampleClass {
//
//    private String store;
//
//    public WrongVoucher(String name, double amount, String type, String store) {
//        super(name, amount, type);
//        this.store = store;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof WrongVoucher)) return false;
//        if (!super.equals(o)) return false;
//        WrongVoucher that = (WrongVoucher) o;
//        return store.equals(that.store);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), store);
//    }
//
//    public static void main(String[] args) {
//        SampleClass name = new SampleClass("name", 2., "");
//        WrongVoucher voucher = new WrongVoucher("name", 2., "", "AMAZON");
//
//        System.out.println(voucher.equals(name));
//        System.out.println(name.equals(voucher));
//    }
//
//    // other methods
//}