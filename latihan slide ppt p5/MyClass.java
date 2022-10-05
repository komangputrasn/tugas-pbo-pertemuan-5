public class MyClass {
    // class with multiple attributes
    static class Person {
        String fname = "John";
        String lname = "Doe";
        int age = 24;
    }

    int x = 5;

    // final variable
    final double PI = 3.14;

    // example of a method
    @SuppressWarnings("unused") // to suppress "unused method warning"
    static void myMethod() {

    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);

        // multiple objects..
        MyClass myObj1 = new MyClass();
        MyClass myObj2 = new MyClass();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        // modify attributes..
        myObj1.x = 40;
        System.out.println(myObj.x);
        
        // instantiating Person object..
        Person person = new Person();
        System.out.println("Name: " + person.fname + " " + person.fname + " " + person.lname);
        System.out.println("Age: " + person.age);

        // this will generate an error: cannot assign value to a final variable
//        myObj1.PI = 25;
    }
}
