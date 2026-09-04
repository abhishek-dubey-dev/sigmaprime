package oops;

public class MethodOverriding {
    private static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    private static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    private static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks

        Animal cat = new Cat();
        cat.sound(); // Output: Cat meows
    }
}
