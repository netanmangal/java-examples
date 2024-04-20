class Main {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle(5, 6);
        System.out.println("Area of rectangle is : " + rect.area());
        
        Square sq = new Square(10);
        System.out.println("Area of square is : " + sq.area());
    }
}

class Shape {
    int height;
    int breadth;
}

interface ShapeArea {
    public int area();
}

class Rectangle extends Shape implements ShapeArea {
    public Rectangle(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }
    
    public int area() {
        return this.height * this.breadth;
    }
}

class Square extends Shape implements ShapeArea {
    public Square(int len) {
        this.height = this.breadth = len;
    }
    
    public int area() {
        return this.height * this.breadth;
    }

}
