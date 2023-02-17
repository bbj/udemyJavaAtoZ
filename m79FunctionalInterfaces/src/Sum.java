/**
 * @FunctionalInterface
 *      - compilation error if no methods or more than 1 method
 *      - static and default methods do not count
 */
@FunctionalInterface
public interface Sum {
    public int add(int num1, int num2);

    static void staticMethod() {
        System.out.println("I am static, so i have an implementation!");
    }
}
