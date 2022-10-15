package com.bbj.app.S03_wrapperClasses;

import java.time.Duration;

public class S3App {

    public static void wrapperClasses() {
        System.out.println("--------------- wrapper classes -------------------");
        //Integer intObject = new Integer(100); //deprecated! old way!
        Integer intObject = Integer.valueOf(100); //without autoboxing
        System.out.println(intObject);
        // 100
        Double doubleObject = Double.valueOf(9); //this int will ne converted into double
        System.out.println(doubleObject);
        // 9.0
        Integer autoboxingObject = 10; //with autoboxing
        System.out.println(autoboxingObject);
        // 10

        int primitiveType = intObject; //in fact calling Integer.valueOf(intObject)
        System.out.println(primitiveType);

        // WARNING: impact on performances in case you use it too much, as methods are called

        //-------------------------- methods ----------------------
        // valueOf(String s)
        Integer intObj = Integer.valueOf("20");
        Double doubObj = Double.valueOf("20.0");
        Boolean boolObj = Boolean.valueOf("false");
        System.out.println("Test valueOf(String s) method: "+intObj+","+doubObj+","+boolObj);
        // Test valueOf(String s) method: 20,20.0,false

        // valueOf(String s, int radix)
        Integer IR = Integer.valueOf("11010", 2);
        System.out.println(IR);
        // 26

        // valueOf(Primitive p);
        Integer IP = Integer.valueOf(30);
        Double DP = Double.valueOf(30.33);
        Character CP = Character.valueOf('a');
        System.out.println("Test valueOf(primitive p) method: "+IP+","+DP+","+CP);
        // Test valueOf(primitive p) method: 30,30.33,a

        Integer integer = 20;
        System.out.println(integer.byteValue());    //20
        System.out.println(integer.shortValue());   //20
        System.out.println(integer.intValue());     //20
        System.out.println(integer.longValue());    //20
        System.out.println(integer.floatValue());   //20.0
        System.out.println(integer.doubleValue());  //20.0

        // parseXxxxx(String s) => UNBOXING!
        int i = Integer.parseInt("40");
        double d = Double.parseDouble("40.3");
        boolean b = Boolean.parseBoolean("true");
        System.out.println("Test parseXxxxx(String s) method: "+i+","+d+","+b);
        //Test parseXxxxx(String s) method: 40,40.3,true

        // parseXxxxx(String s, int radix)
        int i2 = Integer.parseInt("11010", 2);
        long l2 = Long.parseLong("1111", 2);
        System.out.println("Test parseXxxxx(String s, int radix) method: "+i2+","+l2);
        //Test parseXxxxx(String s, int radix) method: 26,15

        // <object>.toString()
        String s = integer.toString();
        System.out.println("s="+s); //40

        // <class>.toString(primitive p[, int radix])
        String s2 = Integer.toString(150);    //150
        String s3 = Character.toString('b');  //b
        String s4 = Long.toString(13, 2);   //1101
        System.out.println("Test <class>.toString(primitive p[, int radix]) method: "+s2+","+s3+","+s4);
        //Test <class>.toString(primitive p[, int radix]) method: 150,b,1101

        //------------------ compareTo, equals, ceil, floor
        Integer I = 10;
        System.out.println(I.compareTo(9));     //1     greater
        System.out.println(I.compareTo(10));    //0     equal
        System.out.println(I.compareTo(11));    //-1    less

        Boolean B1 = true;
        Boolean B2 = false;
        Boolean B3 = true;
        System.out.println(B1.compareTo(B2)); //+1 as true > false (0 > 1)
        System.out.println(B1.compareTo(B3)); //0 as true == true (1 == 1)
        System.out.println(B2.compareTo(B1));  //-1 as false < true

        Integer I2 = 10;
        Integer I3 = 9;
        System.out.println(I.equals(I2)); //true
        System.out.println(I.equals(I3)); //false
        System.out.println(B1.equals(B3)); //true
        System.out.println(B1.equals(B2)); //false

        //ceil() & floor()
        double d1 = 9.51;
        double d2 = 10.2;
        System.out.println(Math.ceil(d1)); //10
        System.out.println(Math.floor(d1)); //9
        System.out.println(Math.round(d1)); //10
        System.out.println(Math.min(d1, d2)); //9.51
        System.out.println(Math.max(d1, d2)); //10.2
        System.out.println(Math.random()); //a double between 0.0 and 1.0, here: 0.9321064399621024

        //------------------ Character methods
        Character ch = 'a';
        Character ch2 = '9';
        Character.isLetter(ch); //true
        Character.isLetter(ch2); //true

        Character ch3 = ' ';
        Character.isSpaceChar(ch3); //true

        Character ch4 = 'A';
        Character.isUpperCase(ch4); //true
        Character.isLowerCase(ch); //true

        Character ch5 = 'e';
        Character.toLowerCase(ch4); //a
        Character.toUpperCase(ch); //A

        //Escape Sequences
        System.out.println("Java says \"Hello\" to the world.");
        System.out.println("Java says \\Hello\\ to the world.\nBye.");
        /*
        Java says \Hello\ to the world.
        Bye.
        */
    }
}
