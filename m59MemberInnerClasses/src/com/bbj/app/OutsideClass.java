package com.bbj.app;

public class OutsideClass {

    private String message = "Hello World!";

    class InnerClass {
        public void showMessage() {
            System.out.println(message);
        }
    }
}
