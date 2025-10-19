class AnimalBase {
    String name;
    int age;

    AnimalBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class DogAnimal extends AnimalBase {
    DogAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class CatAnimal extends AnimalBase {
    CatAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class BirdAnimal extends AnimalBase {
    BirdAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        AnimalBase dog = new DogAnimal("Rex", 3);
        AnimalBase cat = new CatAnimal("Misty", 2);
        AnimalBase bird = new BirdAnimal("Tweety", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
