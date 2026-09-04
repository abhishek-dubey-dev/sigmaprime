package oops;

public class ShallowAndDeepCopy {
    private static class Person implements Cloneable {
        String name;
        int age;
        Address address;

        Person(String name, int age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Shallow copy
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        // Deep copy
        protected Person deepClone() {
            return new Person(this.name, this.age, new Address(this.address.city, this.address.state));
        }
    }

    private static class Address {
        String city;
        String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "NY");
        Person originalPerson = new Person("John", 30, address);

        // Shallow copy
        Person shallowCopyPerson = (Person) originalPerson.clone();
        shallowCopyPerson.name = "Jane";
        shallowCopyPerson.address.city = "Los Angeles";

        System.out.println("Original Person: " + originalPerson.name + ", City: " + originalPerson.address.city);
        System.out.println("Shallow Copy Person: " + shallowCopyPerson.name + ", City: " + shallowCopyPerson.address.city);

        // Deep copy
        Person deepCopyPerson = originalPerson.deepClone();
        deepCopyPerson.name = "Mike";
        deepCopyPerson.address.city = "Chicago";

        System.out.println("Original Person: " + originalPerson.name + ", City: " + originalPerson.address.city);
        System.out.println("Deep Copy Person: " + deepCopyPerson.name + ", City: " + deepCopyPerson.address.city);
    }
}
