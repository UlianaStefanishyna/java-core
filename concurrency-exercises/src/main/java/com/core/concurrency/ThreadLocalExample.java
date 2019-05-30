package com.core.concurrency;

public class ThreadLocalExample {
    public static void main(String[] args) {
        ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(() -> 1);
    }
}
