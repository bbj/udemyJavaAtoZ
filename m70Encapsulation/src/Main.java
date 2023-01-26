import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(22);
        p1.setName("Adam");
        System.out.println(p1); //Person: 22 Adam

        List<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mercedes");
        Cars theCars = new Cars();
        theCars.setCars(cars);
        for(String s: theCars.getCars()) {
            System.out.print(s+" ");        //Honda Ford Mercedes
        }

        System.out.println();

        //Modifying Cars object
        //List and ArrayList are mutable objects
        //versus String which is un-mutable (returns a copy)
        List<String> actualCars = theCars.getCars();
        actualCars.add("BMW");
        //Mutable => no need to call theCars.setCars(actualCars);
        //actualCars is a reference to the cars private parameter
        //GOOD PRACTICE:does not return actual data, but a copy instead:
        //    public List<String> getCars() {
        //        return new ArrayList<>(this.cars);
        //    }
        for(String s: actualCars) {
            System.out.print(s+" ");        //Honda Ford Mercedes BMW
        }
        System.out.println();
        for(String s: theCars.getCars()) {
            System.out.print(s+" ");        //Honda Ford Mercedes
        }
    }
}

/*
Person: 22 Adam
Honda Ford Mercedes
Honda Ford Mercedes BMW
 */