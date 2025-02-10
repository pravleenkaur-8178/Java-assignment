##  Q-3 Explain the difference between method overloading and method overriding in Java. Provide code examples to illustrate both concepts.
**Method overloading-**
Method overloading is when we define multiple methods in the same class with the same name but different parameters.

It occurs within a single class.

Method overloading may or may not require inheritance.

Private and final methods can be overloaded.

Method overloading is a compile-time polymorphism.

ex-
```
class OverloadingExample {
    void display(int num) {
        System.out.println("Integer: " + num);
    }

    void display(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display(5);      // Calls the integer version
        obj.display("Hello");  // Calls the string version
    }
}
```
**Method overriding-**
Method overriding is when a subclass provides a specific implementation for a method that is already defined in its superclass.

It occurs between a parent and child class.

Method overriding always needs inheritance.

Private and final methods can’t be overridden.

Method overriding is a run-time polymorphism.

ex-
```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Calls Animal's method

        Animal dog = new Dog();
        dog.sound();  // Calls Dog's overridden method
    }
}
```
