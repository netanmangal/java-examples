class Homosapien {
    String name;
    int age;
    char gender;
    
    public Homosapien(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Main {
    public static void main(String args[]) {
        Homosapien human1 = new Homosapien("Tony", 0, 'M');
        System.out.println("Using the constructor, the value of human1 is : " + human1);
    }
}
