package com.bbj.app;

//has to implement/override all methods of interfaces
public class MultipleInterfaces implements Interface3 {
    @Override
    public void interfaceMethod1() {
        System.out.println("MultipleInterfaces.interfaceMethod1()");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("MultipleInterfaces.interfaceMethod2()");
    }
}
