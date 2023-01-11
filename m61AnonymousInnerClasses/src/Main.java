public class Main {
    public static void main(String[] args) {

        //AbstractClass aClass = new AbstractClass(); //CANNOT INSTANTIATE AN ABSTRACT CLASS
        //We have to instantiate as an ANONYMOUS INNER CLASS
        AbstractClass aClass = new AbstractClass() {
            @Override
            void showMessage() {
                System.out.println("this is a message!");
            }
        };
        aClass.showMessage();

        //AbstractInterface anInterface = new AbstractInterface(); //CANNOT INSTANTIATE AN INTERFACE
        //We have to instantiate as an ANONYMOUS INNER CLASS
        AbstractInterface anInterface = new AbstractInterface() {
            @Override
            public void showMessage() {
                System.out.println("this is a message!");
            }
        };
    }
}