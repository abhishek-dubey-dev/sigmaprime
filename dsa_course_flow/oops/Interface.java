package oops;

public class Interface {
    public interface Animal {
        void sound();
    }

    public static class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Woof");
        }
    }

    public static class Cat implements Animal {
        @Override
        public void sound() {
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
