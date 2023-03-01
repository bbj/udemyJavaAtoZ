package com.bbj;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Bruno Jullien");

        //create an empty optional
        Optional<Person> personEmpty = Optional.empty();
        System.out.println(personEmpty); //"Optional.empty" instead of a null reference

        //create a Person optional
        Optional<Person> personOptional = Optional.of(person);
        System.out.println(personOptional.get());   //Bruno Jullien
                                                    //if toString() not redefined: com.bbj.Person@372f7a8d is a valid reference
        System.out.println(personOptional);         //Optional[Bruno Jullien]

        // Optional.of()
        //what if person is null
        Person personNull = null;
        Optional<Person> optionalPersonNull = Optional.empty();;
        try {
            optionalPersonNull = Optional.of(personNull);//Exception in thread "main" java.lang.NullPointerException
        } catch (Exception e) {
            System.out.println(e); //"java.lang.NullPointerException"
            //so the Optional.of() method is not the best solution
        }

        // Optional.ofNullable() - other alternative - better solution
        Person person1 = null;
        Optional<Person> optionalPerson1 = Optional.ofNullable(person1);
        System.out.println(optionalPerson1); //Optional.empty

        if (optionalPerson1.isPresent()) {
            System.out.println("there is a non null object in optionalPerson1: "+optionalPerson1.get());
        } else {
            System.out.println("optionalPerson1 is empty"); //optionalPerson1 is empty
        }

        // orElse()
        Optional<Person> o = Optional.ofNullable(new Person("Peter Pan"));
        Person p = o.orElse(new Person("New Person Object if 'o' is null"));
        System.out.println(p); //Peter Pan
        Optional<Person> o1 = Optional.ofNullable(null);
        Person p1 = o1.orElse(new Person("New Person Object if 'o1' is null"));
        System.out.println(p1); //"New Person Object if 'o1' is null"

        // orElseGet() and Lambda Expression or Method Reference
        Optional<Person> o2 = Optional.ofNullable(null);
        Person p2 = o1.orElseGet(()->giveAnotherPerson()); //Lambda Expression
        System.out.println(p2); //New Person from giveAnotherPerson()
        Person p3 = o1.orElseGet(Main::giveAnotherPerson); //Method Reference
        System.out.println(p3); //New Person from giveAnotherPerson()
    }

    public static Person giveAnotherPerson() {
        return new Person("New Person from giveAnotherPerson()");
    }
}