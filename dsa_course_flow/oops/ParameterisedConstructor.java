package oops;

public class ParameterisedConstructor {
    public static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
            System.out.println("Animal constructor called for: " + name);
        }
    }

    public static class Dog extends Animal {
        Dog(String name) {
            super(name);
            System.out.println("Dog constructor called for: " + name);
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        // Output:
        // Animal constructor called for: Buddy
        // Dog constructor called for: Buddy
    }
}
