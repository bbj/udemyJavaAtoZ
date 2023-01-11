public class Main {

    /**
     * If SuperClass does not declare an exception, then
     *    - SubClass can only declare unchecked exceptions
     *    - (not checked Exceptions)
     * If SuperClass declares an exception, then
     *    - Subclass can only declare the child exceptions
     *      of the exception declared by the SuperClass
     * Simply put:
     *    - Subclasses can throw fewer checked exceptions than
     *      their superclass, but not more.
     */

    public static void main(String[] args) {

    }
}