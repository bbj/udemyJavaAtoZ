package com.bbj;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        Stamp stamp = new Stamp("Barbados");
//        Passport passport = new Passport(stamp);
//        Person person = new Person("Kevin", passport);
//        System.out.println(person.getName()+" - "+person.getPassport().getStamp().getStampOfCountry()); //Kevin - Barbados

        /**
         * Problem: if passport or stamp are null => need a lot of if !!!
         */
        Optional<Stamp> optionalStamp = Optional.ofNullable(new Stamp("Barbaros"));
        //Optional<Stamp> optionalStamp = Optional.ofNullable(null);
        Optional<Passport> optionalPassport = Optional.ofNullable(new Passport(optionalStamp));
        Optional<Person> optionalPerson = Optional.ofNullable(new Person("Bruno Jullien", optionalPassport));
        //using Optional.map(): if a value is present apply the provided function
        //                      else return an empty optional
//        String stampOfCountry =
//                optionalPerson
//                .map(Person::getPassport)
//                .map(Passport::getStamp)
//                .map(Stamp::getStampOfCountry).orElse("Unknown");
        //WE HAVE COMPILATION ERROR as we cannot use Optional as map arguments!
        //we have to use flatMap
        String stampOfCountry =
                optionalPerson
                .flatMap(Person::getPassport)
                .flatMap(Passport::getStamp)
                .map(Stamp::getStampOfCountry)
                .orElse("Unknown");
        System.out.println(stampOfCountry);//Barbaros

        //if we had: optionalStamp = Optional.ofNullable(null); => Unknown
    }
}