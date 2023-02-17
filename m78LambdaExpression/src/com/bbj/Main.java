package com.bbj;

public class Main {
    public static void main(String[] args) {

        //WITHOUT LAMBDA EXPRESSION
        //using Anonymous Inner Class implements interface Sum
        Sum sum = new Sum() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
        System.out.println(sum.add(10, 5)); //15

        //WITH LAMBDA EXPRESSION (only when only one method in interface)
        //
        //Sum sumLambda = (int num1, int num2) -> {return num1 + num2;};
        //Simplified syntax:
        Sum sumLambda = (num1, num2) -> num1 + num2;
        System.out.println(sumLambda.add(100, 50)); //150

        //public interface Greeting { public void sayHello(); }
        //returns void and no params
        Greeting greeting = () -> System.out.println("Hello World via lambda expression");
        greeting.sayHello(); //Hello World via lambda expression
        /*
            if Greeting has a param, such as public void sayHello(name);
            we would have:
            Greeting greeting = (name) -> System.out.println("Hello World via lambda expression to: "+name);
         */
    }
}