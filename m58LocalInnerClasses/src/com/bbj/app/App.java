package com.bbj.app;

public class App {

    /**
     * Local Inner Class:
     *      - non-static, inside a class, inside a method
     *      - accessing the instance variable members of the Outer class
     */
    public static void main(String[] args) {
        OutsideClass outsideClass = new OutsideClass();
        outsideClass.outerMethod();
    }
}
