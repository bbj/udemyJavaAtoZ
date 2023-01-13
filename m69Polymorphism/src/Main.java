public class Main {
    public static void main(String[] args) {
        //we can achieve polymorphism thanks to inheritance
        Parent p1 = new Parent();
        Parent p2 = new Child();            //as Child is a Parent, we can do this
        Parent p3 = new GrandChild();       //as GrandChild is a Parent

        p1.travel();    //Parent.travel()
        p2.travel();    //Child.travel()
        p3.travel();    //GrandChild.travel()

        //In Java, we can override methods only, not the variables (data members)
        //So runtime polymorphism cannot be achieved for data members (variables)
        System.out.println(p1.age); //50
        System.out.println(p2.age); //50    a child is a parent => parent age is taken
        System.out.println(p3.age); //50    polymorphism not working => parent age is taken

        //Solution: avoid polymorphism
        Child p22 = new Child();            //a Child ref
        System.out.println(p22.age); //30   Child p22 => child age is displayed
    }
}