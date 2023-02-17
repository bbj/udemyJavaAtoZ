public class Main {

    /**
     * Comparison between Lambda Expression and Method References
     */
    public static void main(String[] args) {

        //Using a lambda expression, with a call of a static method
        Sum sum = (num1, num2) -> add(num1, num2);
        System.out.println(sum.addition(10, 11)); //21

        //Using method references, referencing the same static method
        Sum sum2 = Main::add;
        //The rest is the same....
        System.out.println(sum2.addition(23, 7));

        //THIS IS THE MAIN ADVANTAGE OF LAMBDAS
        // => we can chain operations!
        //BEST for more complex operations
        Sum sum3 = (num1, num2) -> add(num1, increment(num2));
        System.out.println(sum3.addition(100, 90)); //200 (100 + (90+10))

        //CANNOT CHAIN OPERATIONS with METHOD REFERENCES
        //App::add::increment; or something like that
        //SO ONLY for simple one method call operations
    }

    private static int add(int n1, int n2) {
        return n1 + n2;
    }
    private static int increment(int num) {
        return num + 10;
    }
}