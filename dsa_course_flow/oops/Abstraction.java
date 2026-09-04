package oops;

public class Abstraction {
    public static abstract class Animal {
        abstract void sound();
    }

    public static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Woof

        Animal cat = new Cat();
        cat.sound(); // Output: Meow
    }
}
