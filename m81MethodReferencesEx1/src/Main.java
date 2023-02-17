import java.util.Arrays;

interface FunctionalInterface {
    public void show(); //only 1 abstract method => functional interface
}

interface FunctionalInterface2 {
    MessageClass showMessage(String str);
}

public class Main {
    /**
     * Method References
     *
     * There are four kinds of method references:
     *
     * 1. Reference to a Static Method
     * 2. Reference to an Instance Method of a Particular Object
     * 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
     * 4. Reference to a Constructor
     */
    public static void main(String[] args) {

        //1. Reference to a Static Method
        FunctionalInterface functionalInterface = Main::staticGreeting;
        functionalInterface.show(); //"Greeting from a static method..."

        //2. Reference to an Instance Method of a Particular Object
        Main app = new Main();
        FunctionalInterface functionalInterface2 = app::instanceGreeting;
        //... = new Main()::instanceGreeting; is working too
        functionalInterface2.show(); //"This is a greeting from an instance method..."

        //3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
        String[] names = {"Kevin","Alan","Adam","Joe","Kate"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names)); //[Adam, Alan, Joe, Kate, Kevin]

        //4. Reference to a Constructor - constructor of MessageClass
        FunctionalInterface2 interface2 = MessageClass::new;
        interface2.showMessage("This is the message...");
    }

    public static void staticGreeting() {
        System.out.println("Greeting from a static method...");
    }

    public void instanceGreeting() {
        System.out.println("This is a greeting from an instance method...");
    }
}