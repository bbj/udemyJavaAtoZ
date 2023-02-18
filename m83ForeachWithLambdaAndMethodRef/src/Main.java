import java.util.*;

public class Main {

    /**
     *  foreach with Lambda and Method Reference
     *
     *  Introduced in Java 8, the forEach loop provides programmers with a new, simplified
     *  way for iterating over a collection.
     */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Kevin");
        names.add("Natali");
        names.add("Joe");
        names.add("Brad");

        //using for loop
        for (String s: names) {
            System.out.print(s+","); //Adam,Kevin,Natali,Joe,Brad,
        }
        System.out.println();

        //using forEach(lambda expression)
        names.forEach((s -> System.out.print(s+','))); //Adam,Kevin,Natali,Joe,Brad,
        System.out.println();

        //using method reference
        names.forEach(System.out::print); //AdamKevinNataliJoeBrad
        System.out.println();

        //Set
        Set<String> set = new HashSet<>(Arrays.asList("item1","item2","item3"));
        set.forEach(s -> System.out.print(s)); //item2item1item3
        System.out.println();

        //Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        //map.entrySet() returns a set
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey()+"-"+entry.getValue()+",");//A-10,B-20,C-30,
        }
        System.out.println();
        map.forEach((key,value) -> System.out.print(key+"+"+value+","));//A+10,B+20,C+30,

        //Method reference
        //items.forEach(System.out::println); ===> ERROR as 2 parameters
        //Error: The type PrintStream does not define println(String, Integer)
        //       that is applicable here

    }
}