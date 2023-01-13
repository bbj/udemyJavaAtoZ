package com.bbj.app;

public class HybridClass extends Parent implements Interface3 {

    //mandatory
    @Override
    public void interfaceMethod1() {
        System.out.println("HybridClass.interfaceMethod1()");
    }

    //mandatory
    @Override
    public void interfaceMethod2() {
        System.out.println("HybridClass.interfaceMethod2()");
    }

    //optional
    @Override
    protected void parentMethod() {
        super.parentMethod();
    }
}
