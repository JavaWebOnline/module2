package ss5_polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Birdsong.");
    }
}

class Cat extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Cat meows.");
//    }
}

public class Runtime {
    public static void main(String[] args) {
        Animal animal1 = new Bird(); // Đa hình
        Animal animal2 = new Cat();

        animal1.sound(); // Output: Birdsong.
        animal2.sound(); // Output: Cat meows.
    }
}
