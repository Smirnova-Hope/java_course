class Animal {
    void sound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    @Override 
    void sound() {
        System.out.println("Гав-гав!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Мяу-мяу");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();    
        Animal myCat = new Cat();
        
        myAnimal.sound();   
        myDog.sound();      
        myCat.sound();      // Мяу-мяу
    }
}
