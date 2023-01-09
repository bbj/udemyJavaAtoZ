package com.bbj.app;

public class OutsideClass {

    private String message = "a message ...";

    public void outerMethod() {

        class InnerClass {
            public void showMessage() {
                //inner class can access an instance variable
                //of the OutsideClass
                System.out.println(message);
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.showMessage();
    }
}
