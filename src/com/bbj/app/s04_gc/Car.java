package com.bbj.app.s04_gc;

public class Car {

    //instance variables, store on the heap with objects
    private int speed;
    private String nameOfOwner;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        //Called when object is removed from Heap memory
        System.out.println(this+" object cleaned from heap memory...");
    }
    /**
     * Just before destroying an object, Garbage Collector calls finalize() method on the object to perform
     * cleanup activities. Once finalize() method completes, Garbage Collector destroys that object.
     *
     * finalize() is deprecated from JDK 9 : The finalization mechanism is inherently problematic. Finalization
     * can lead to performance issues, deadlocks, and hangs. -> don't use it
     **/
}
