public class Main {
    public static void main(String[] args) {

        //outer try-catch block
        try {
            int exampleArray[] = {1,2,3,4,5};
            System.out.println(exampleArray[9]); //out of bounds

            //will never get here!
            try {
                int x = exampleArray[3] / 0;
                System.out.println("will never get here!");
            } catch (ArithmeticException e2) {
                System.out.println("ArithmeticException: "+e2);
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException: "+e1);
        }

        System.out.println("The application survived!");
    }
}