package com.bbj.app;

public class App implements OuterInterface.NestedInterface, OuterClass.NestedClassInterface {

    /**
     * Abstraction - Nested Interface
     *
     * An interface which is declared inside another interface or class is call nested (or inner) interface.
     * The nested interfaces are used to group related interfaces so that they can be easy to maintain.
     * The nested interface must be referred by the outer interface or class.
     * It can't be accessed directly.
     */
    public static void main(String[] args) {

        OuterInterface.NestedInterface msg = new App(); //polymorphism: ref can be assigned to the nested interface
        msg.messageInside(); //"This is a method within a nested interface..."

        OuterClass.NestedClassInterface show = new App(); //polymorphism again
        show.show(); //"This is the show() within the OuterClass's nested interface..."
    }

    @Override
    public void messageInside() {
        System.out.println("This is a method within a nested interface...");
    }

    @Override
    public void show() {
        System.out.println("This is the show() within the OuterClass's nested interface...");
    }
}