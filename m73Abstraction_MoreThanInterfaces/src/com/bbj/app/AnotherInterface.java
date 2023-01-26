package com.bbj.app;

public interface AnotherInterface {
    //JDK 8 - default method - same as other interface
    public default void defaultMethod() {
        System.out.println("This is a default method from AnotherInterface...");
    }
}
