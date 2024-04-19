class Abstraction {
    public static void main(String args[]) {
            Bear bear = new Bear();
            bear.sleep();
            bear.animalSound();
    }
}

abstract class AnimalAbstractClass {
    public abstract void animalSound();

    public void sleep() {
            System.out.println("Our animal is going for sleep.");
    }
}

class Bear extends AnimalAbstractClass {
    public void animalSound() {
            System.out.println("From Abstract function : Bear's sound is : roar roar.");
    }
}
