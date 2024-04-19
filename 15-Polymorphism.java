class Polymorphism {
    public static void main(String args[]) {
            Cat c1 = new Cat("Kittao");
            System.out.println(c1.animalSound());

            Dog d1 = new Dog("Doggiii");
            System.out.println(d1.animalSound());
    }
}

class Animal {
    String name;

    public String animalSound() {
            return "This is animal sound : animal animal!";
    }
}

class Cat extends Animal {
    public Cat(String name) {
            this.name = name;
    }

    public String animalSound() {
            return "This cat : " + this.name + " : sounds : meow meow";
    }
}

class Dog extends Animal {
    public Dog(String name) {
            this.name = name;
    }

    public String animalSound() {
            return "This dog : " + this.name + " : sounds : bow bow";
    }
}
