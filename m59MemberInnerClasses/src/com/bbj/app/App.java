package com.bbj.app;

public class App {
    public static void main(String[] args) {

        //Need to instantiate outside class first
        OutsideClass outsideClass = new OutsideClass();
        //Special syntax to new an inner class
        OutsideClass.InnerClass innerClass = outsideClass.new InnerClass();

        innerClass.showMessage();
    }
}