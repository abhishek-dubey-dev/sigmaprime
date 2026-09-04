package oops;

public class NonParameterisedConstructor {
    public static class Animal {
        Animal() {
            System.out.println("Animal constructor called");
        }
    }

    public static class Dog extends Animal {
        Dog() {
            System.out.println("Dog constructor called");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        // Output:
        // Animal constructor called
        // Dog constructor called
    }
}
