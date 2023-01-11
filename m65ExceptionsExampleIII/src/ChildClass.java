import java.io.IOException;

public class ChildClass extends ParentClass {
    @Override
    public void method() throws ArrayIndexOutOfBoundsException, NullPointerException {
        System.out.println("this is the child class...");
    }

    /**
     * - we cannot do
     *      public void method() throws IOException {
     *   as the parent class method does not throws IOException
     *   => compile time error:
     *   'method()' in 'ChildClass' clashes with 'method()' in 'ParentClass'; overridden method does not throw 'java.io.IOException'
     * - if parent class throws IOException, no errors!
     * - if parent class throws Exception, works fine as well
     * - if parent class doesnt throws any exceptions
     *   we can throws unchecked (runtime) exceptions such as:
     *       ArrayIndexOutOfBoundsException
     *       NullPointerException
     *   but no checked (compile-time) exceptions such as:
     *       IOException
     *       ClassNotFoundException
     */
}
