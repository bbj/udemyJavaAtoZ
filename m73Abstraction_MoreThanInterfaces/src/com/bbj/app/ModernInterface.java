package com.bbj.app;

public interface ModernInterface {

    //classic interface method (abstract method)
    public void abstractMethod();

    //JDK 8 - static method
    public static void staticMethod() {
        System.out.println("This is a static method in the interface...");
    }

    //JDK 8 - default method
    public default void defaultMethod() {
        System.out.println("This is a default method in the interface...");
    }
}
