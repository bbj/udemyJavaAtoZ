import java.util.function.*;

public class Main {
    /**
     * Any interface with a SAM (Single Abstract Method) is a functional interface,
     * and its implementation may be treated as lambda expressions.
     *
     *      --> BUT the interface may contain other methods: static and default methods (!!!)
     *
     *      --> there are predefined functional interfaces:
     *          e.g.: Consumer<T>, Predicate<T>, UnaryOperator<T>, Supplier<T>...
     */
    public static void main(String[] args) {

        Sum sum = (num1, num2) -> num1 + num2; //sum is an implementation of the interface via lambda expression
        System.out.println(sum.add(100, 5)); //105

        /**
         * Predefined functional Interfaces - Consumer<T>
         */
        // Consumer interface represents an operations that accepts a single input argument and returns no results
        Consumer<String> cons = (st) -> System.out.println(st.toLowerCase());
        cons.accept("Java programming: Step by Step from A to Z");
        // accept: performs operation on the given arguments.

        /**
         * Predefined functional Interfaces - Predicate<T>
         */
        // Predicate interface represents a predicate (boolean-value function) of one argument.
        Predicate<Integer> pr = a -> (a > 10);
        System.out.println(pr.test(11)); //true
        // test: evaluates this predicate on the given argument

        /**
         * Predefined functional Interfaces - UnaryOperator<T>
         */
        // It represents an operation on a single operand that return a result of the same type
        // as its operand.
        UnaryOperator<String> str = (x) -> x.toUpperCase();
        System.out.println(str.apply("hello java"));

        /**
         * Predefined functional Interfaces - Supplier<T>
         */
        // It represents a supplier of results.
        // The supplier can be used in all contexts where there is no inputs but an output is expected.
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Supplier random value: "+randomValue.get());

        /**
         * Predefined functional Interfaces - Function<T,R>
         */
        // It represents a function that accepts one argument and returns a result.
        Function<String, String> functionExample = s -> {
            return message(s);
        };
        System.out.println("Supplier random value: "+randomValue.get());
    }

    static String message(String s) {
        return "Hello "+s;
    }
}