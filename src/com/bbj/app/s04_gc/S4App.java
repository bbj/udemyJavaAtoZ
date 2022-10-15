package com.bbj.app.s04_gc;

public class S4App {
    public static void run() {

        Car car = new Car();
        car = null; //the object becomes eligible for GC
        System.gc(); //non-deterministic: as VM decides when to do GC
        /**
         * Nothing happen when we call System.gc() because there is only 1 object elligible for garbage collection and
         * the JVM doesn't feel the need for collect garbage immediately despite of the command System.gc()
         */
        /**
         * To call System.gc() is a bad practice. Let's all recognize that System.gc() isn't an absolute solution and
         * you can't rely on it as a fix and it's probably a sign that you have some less-than-good code on your
         * hands. Alternatives instead of System.gc(): - Re-read code. You might be holding on to references to
         * objects without realizing it. - Adjust your JVM memory arguments and run profiling tools to figure out
         * what's going on and why you seem to be running out of memory.
         */

        for (int i=0; i<100; i++) {
            Car car1 = new Car();
            car1 = null; //the object becomes eligible for GC
            System.gc(); //non-deterministic: as VM decides when to do GC
            //in fact if we do i<10000000, and do not call System.gc();
            //GC will be called automatically
        }
        /*
        ....
        com.bbj.app.s04_gc.Car@7d52e816 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@33027d42 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@2fd02f11 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@599ecec8 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@33669fb5 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@132e1cf6 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@3d280125 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@12ef60c6 object cleaned from heap memory...
        com.bbj.app.s04_gc.Car@1573ce19 object cleaned from heap memory...
        ...
         */

    }
}
