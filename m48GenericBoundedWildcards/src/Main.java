import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        // upper bounded wildcards generics
        List<Double> nums = new ArrayList<>();
        nums.add(23.3);
        nums.add(13.1);
        printUpperBounded(nums);

        // upper bounded wildcards generics
        // if we replace Number by Integer or Object, it still works (? super Integer)
        List<Number> list = new ArrayList<>();
        list.add(5);
        addAndPrint(list);

        // unbounded wildcards generics
        //
        // Unbounded wildcard type is specified using <?>
        // e.g. List<?> list;
        // it is called: a list of unknown type, useful in these cases:
        // 1. When writing a method which can be employed using functionality
        //    provided in Object class.
        // 2. When the code is using methods in the generic class that don't
        //    depend on the type parameter
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        printAll(list2); // 10, 20, 30
        // works fine for Double, String as they all can be printed
    }

    // upper bounded
    public static <T>void printUpperBounded(List<? extends Number> numbers) {

        for (Number value: numbers) {
            System.out.println(value); //23.3 13.1
        }
    }

    // lower bounded
    // we can use with all the super classes of Integer: Number, Object
    public static <T>void addAndPrint(List<? super Integer> list) {

        list.add(10);
        list.add(20);

        System.out.println(Arrays.toString(list.toArray()));
    }

    // unbounded
    public static void printAll(List<?> list) {
        for (Object item: list) {
            System.out.println(item);
        }
    }
}