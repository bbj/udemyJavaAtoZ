package com.bbj.app;

public class App implements ModernInterface, AnotherInterface {

    /**
     * Modern Interface
     * Originally an interface could only have abstract methods, but
     * since JDK 8, the interface body can contain:
     *      - abstract methods (classic interface methods),
     *      - default methods,
     *      - and static methods too.
     */
    public static void main(String[] args) {
        App app = new App();
        app.abstractMethod(); //"Abstract interface method from the Main class..."

        ModernInterface.staticMethod(); //cannot do App.staticMethod()
        app.defaultMethod(); //no need to @Overwrite the default interface method to be able to call it

        /**
         * Multiple Default methods
         *
         * With default functions in interfaces, there is a possibility that
         * a class is implementing 2 interfaces with same default methods.
         *      1. we can override it
         *      2. we can call the default method of the specified interface using super
         */
    }

    //This abstract method from ModernInterface MUST be implemented
    //The default and static methods do not have to be overwritten
    @Override
    public void abstractMethod() {
        System.out.println("Abstract interface method from the Main class...");
    }

    @Override
    public void defaultMethod() {
        //to avoid runtime error, need to specify AnotherInterface.super
        AnotherInterface.super.defaultMethod(); //"This is a default method from AnotherInterface..."
    }
}