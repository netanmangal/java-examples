class Encapsulation {
        public static void main(String args[]) {
                Homosapien human1 = new Homosapien("Tony", 0, 'M');
                Homosapien human2 = new Homosapien("Paras", 9, 'M');
    
                // name has private access
                // human1.age = 4; 
    
                human1.setName("Stark");
                human2.setGender('F');
    
                System.out.println("--- Human 1 ---");
                System.out.println("Value of human1.name : " + human1.getName());
                System.out.println("Value of human1.age : " + human1.getAge());
                System.out.println("Value of human1.gender : " + human1.getGender());
    
                System.out.println("\n--- Human 2 ---");
                System.out.println("Value of human2.name : " + human2.getName());
                System.out.println("Value of human2.age : " + human2.getAge());
                System.out.println("Value of human2.gender : " + human2.getGender());
        }
    }
    
    class Homosapien {
        private String name;
        private int age;
        private char gender;
    
        public Homosapien(String name, int age, char gender) {
                this.name = name;
                this.age = age;
                this.gender = gender;
        }
    
        public String getName() {
                return this.name;
        }
    
        public int getAge() {
                return this.age;
        }
    
        public char getGender() {
                return this.gender;
        }
    
        public void setName(String name) {
                this.name = name;
        }
    
        public void setAge(int age) {
                this.age = age;
        }
    
        public void setGender(char gender) {
                this.gender = gender;
        }
    }
    