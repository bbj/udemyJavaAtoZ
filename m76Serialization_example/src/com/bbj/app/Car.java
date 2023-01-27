package com.bbj.app;

import java.io.Serial;
import java.io.Serializable;

/**
 * The Car class is going to be transformed into a byte stream.
 * For this reason, we have to be sure it implements Serializable interface.
 * we have to:
 *     - generate a serialVersionUID (setting: JVM languages / Serializable class without serialVersionUID [X]
 */


public class Car implements Serializable {

    /**
     * serialVersionUID:
     *  - is going to be the value that identify the class we would like to serialize
     *  - the serialization runtime associates a version number with each Serializable class
     *  - used by serialization and deserialization to check both sides classes are compatible (Invalid class exception)
     *  - it verifies that the deserialized object has the same serialVersionUID as the serialized object
     *  - if we do not specify one, JVM will generate one, but it is recommended to generate one
     *  - it is good practice to provide the serialVersionUID value:
     *      - and update it after changes to the class
     *      - so that we can have control over the serialization/deserialization process
     *      - avoid performance issues as generating serialVersionUID uses complex algo based on class details
     *      - avoid different UID generated when not same JVM used (platform, version)
     *      - avoid issues when .class is modified by receiver for any reason (instrumenting, ...)
     */
    @Serial
    private static final long serialVersionUID = 3353513213968568198L;

    String carBrand;
    int motorNumber;
    transient String color; //the color is not going to be serialized

    public Car(String carBrand, int motorNumber, String color) {
        this.carBrand = carBrand;
        this.motorNumber = motorNumber;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.carBrand+"-"+this.motorNumber+"-"+this.color;
    }
}
