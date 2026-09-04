package oops;

public class SingleLevelInheritance {
    public static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    public static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class
    }
}
