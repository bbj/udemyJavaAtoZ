package com.bbj.app;

public class Main {
    public static void main(String[] args) {

        //[single-level] inheritance
        Child child = new Child();
        child.parentMethod(); //child can call protected of parent
        child.childMethod(); //protected can be called here

        //multi-level inheritance
        GrandChild grandChild = new GrandChild();
        grandChild.childMethod();
        grandChild.parentMethod();
        grandChild.grandChildMethod();

        MultipleInterfaces multipleInterfaces = new MultipleInterfaces();
        multipleInterfaces.interfaceMethod1();
        multipleInterfaces.interfaceMethod2();

        HybridClass hybridClass = new HybridClass();
        hybridClass.interfaceMethod1();
        hybridClass.interfaceMethod2();
        hybridClass.parentMethod();
    }
}