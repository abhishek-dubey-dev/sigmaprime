package oops;

public class MultiLevelInheritance {
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

    public static class Puppy extends Dog {
        @Override
        void sound() {
            System.out.println("Puppy yelps");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Output: Animal makes a sound

        Dog myDog = new Dog();
        myDog.sound(); // Output: Dog barks

        Puppy myPuppy = new Puppy();
        myPuppy.sound(); // Output: Puppy yelps
    }
}
