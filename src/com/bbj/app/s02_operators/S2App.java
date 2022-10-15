package com.bbj.app.s02_operators;

public class S2App {
    public static void logical() {
        System.out.println("--------------- logical -----------------");
        int a = 10;
        int b = 20;
        if (a<5 && b<100 || a!=11) { //=> (a<5 && b<100) || a!=11
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        //TRUE
    }

    public static void ternary() {
        System.out.println("--------------- ternary -------------------");
        int a = 10;
        int b = 20;
        int smallerValue = a < b ? a : b;
        System.out.println("smaller = "+smallerValue);
        //smaller is 10
        String name = "Adam";
        String res = name.equals("Adam") ? "name is Adam" : "NOT Adam";
        //name is Adam
        System.out.println(res);
        System.out.println(a==0 ? "ZERO" : a<0 ? "negative" : "positive");
        //positive
    }

    public static void comparison() {
        System.out.println("--------------- comparison -------------------");
        Cat cat = new Cat();
        Dog dog = new Dog();

        if (cat instanceof Animal) {
            System.out.println("Cat is an animal...");
        }
        if (dog instanceof Mammal) {
            System.out.println("Dog is a mammal...");
        }
        //Cat is an animal...
        //Dog is a mammal...
    }
}
