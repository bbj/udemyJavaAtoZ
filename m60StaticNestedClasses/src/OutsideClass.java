public class OutsideClass {

    private static String message = "hello world!";

    static class NestedStaticClass {
        public void showMessage() {
            //cannot access "message" variable (non-static)
            System.out.println(message);
        }
    }
}
