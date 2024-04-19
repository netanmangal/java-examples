class Inheritance {
    public static void main(String args[]) {
        Cat c = new Cat("Cat #1 is my name");

        System.out.println("Cat details : " + c.name);
        System.out.println("Cat's voice : " + c.voice());
    }
}

class Animal {
    protected String name = "Animal";

    public String voice() {
        return "ahahahah!";
    }

    final public String creatureType() {
        return "Animal.";
    }
}

class Cat extends Animal {
    // protected String name = "Cat #1 is my name";

    public Cat(String name) {
        this.name = name;
    }

    public String voice() {
        return "Meow meow";
    }
}
