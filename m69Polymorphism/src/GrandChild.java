public class GrandChild extends Child {
    protected int age = 10;

    @Override
    protected void travel() {
        System.out.println("GrandChild.travel()");
    }
}
