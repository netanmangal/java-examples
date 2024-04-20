class Enums {
    public static void main(String args[]) {
        Human h1 = new Human("Paras", 25, Human.Gender.MALE);
        Human h2 = new Human("Piya", 26, Human.Gender.FEMALE);
        Human h3 = new Human("Triya", 27, Human.Gender.OTHER);
        
        h1.printDetails();
        h2.printDetails();
        h3.printDetails();
    }
}

class Human {
    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
    
    String name;
    int age;
    Gender gender;
    
    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void printDetails() {
        switch (this.gender) {
            case MALE:
                System.out.println("Human with name : " + this.name + " , Age : " + this.age + " is of gender MALE");
                break;
            case FEMALE:
                System.out.println("Human with name : " + this.name + " , Age : " + this.age + " is of gender FEMALE");
                break;
            case OTHER:
                System.out.println("Human with name : " + this.name + " , Age : " + this.age + " is of gender OTHER");
                break;
        }
    }
}
