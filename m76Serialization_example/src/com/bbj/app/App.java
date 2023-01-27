package com.bbj.app;

import java.io.*;

public class App {

    public static void main(String[] argv) throws ClassNotFoundException {

        //Car car = new Car("Ford", 12345, "green");
        Ford car = new Ford("Ford", 12345, "green", "Focus");

        //SERIALIZE
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serialization.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //we serialize the object
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Car has been serialized...");
        } catch (IOException e) {
            //FileNotFoundException inherits from IOException, we generalize to all IO Exceptions
            e.printStackTrace();
        }

        //DESERIALIZE
        try {
            FileInputStream fileInputStream = new FileInputStream("serialization.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            //we deserialize the object
            //readObject => unhandled ClassNotFoundException => add throws ClassNotFoundException to main() signature
            Car deserializedCar = (Car) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Car has been deserialized...");
            System.out.println(deserializedCar);    //String color; => Ford-12345-green
                                                    //transient String color;  => Ford-12345-null
            //Ford class => Ford{fordType='Focus', carBrand='Ford', motorNumber=12345, color='null'}
        } catch (IOException e) {
            //FileNotFoundException inherits from IOException, we generalize to all IO Exceptions
            e.printStackTrace();
        }
    }
}
