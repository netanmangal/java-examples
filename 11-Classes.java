class Vehicle {
    String uniqueId;
    int tyres;
    char color;

    public String getUniqueID() {
        return uniqueId + "-t:" + tyres + "-c:" + color;
    }
}

class Classes {
    public static void main(String args[]) {
        Vehicle v = new Vehicle();

        v.uniqueId = "DD324E";
        v.tyres = 4;
        v.color = 'R';

        System.out.println("Unique ID of v : " + v.getUniqueID());
    }
}
