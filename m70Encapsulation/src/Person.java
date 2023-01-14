public class Person {
    //Encapsulation:
    //       we use Person as a wrapper class where we store name and age data
    //       and provide getter and setter for the 2 private attributes
    private String name;
    private int age;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be < 0!");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: "+this.age+" "+this.name;
    }
}
