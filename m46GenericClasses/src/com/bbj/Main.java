package com.bbj;

class Box<T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

public class Main {

    public static void main(String[] args) {

        Box<Integer> box = new Box<>(100);
        System.out.println(box.getElement());

        Box<String> box1 = new Box<>("Adam");
        System.out.println(box1.getElement());
    }
}
