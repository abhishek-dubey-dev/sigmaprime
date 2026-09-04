package oops;

public class Inheritance {
    public static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    public static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        Animal myCat = new Cat();
        myCat.sound(); // Output: Cat meows
    }
}
