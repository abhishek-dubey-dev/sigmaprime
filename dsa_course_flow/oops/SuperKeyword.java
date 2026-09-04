package oops;

public class SuperKeyword {
    private static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    private static class Dog extends Animal {
        @Override
        void sound() {
            super.sound(); // Calls Animal's sound() method
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound(); // Output: Animal makes a sound
                       // Dog barks
    }
}
