import java.util.ArrayList;

class Arraylist {
    public static void main(String args[]) {
        ArrayList<String> as = new ArrayList<String>();
        
        // add elements to ArrayList
        as.add("Human1");
        as.add("Human2");
        as.add("Human3");
        as.add("Human4");
        as.add("Human5");
        
        // edit element of an ArrayList
        as.set(3, "HumanX");
        
        // fetching the elements
        for (int i = 0; i < as.size(); i++) {
            System.out.println("Element at index : " + i + " : is : " + as.get(i));
        }
    }
}

