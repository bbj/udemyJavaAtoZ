package com.bbj.app;

public class Parent {
    //if it was private => child cannot override it
    protected void parentMethod() {
        System.out.println("parentMethod()");
    }
}
