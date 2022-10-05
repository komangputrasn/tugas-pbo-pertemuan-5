class Constructors {
    static class MyClass {
        int x;

        MyClass() {
            x = 5;
        }
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }
}
