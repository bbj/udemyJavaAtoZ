public class Main {

    /*
        Static Nested Class
        - created within class
        - static class
        - defined at same level as static variables
        - can access static variables of Outer class
        - cannot access non-static variables and methods
        - nested class can be accessed without instantiating outer class
     */
    public static void main(String[] args) {
        //no need to instantiate OutsideClass as nested is static
        OutsideClass.NestedStaticClass nested = new OutsideClass.NestedStaticClass();
        nested.showMessage();
    }
}