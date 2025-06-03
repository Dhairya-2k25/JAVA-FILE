class Shape_3{
    void area() {
        System.out.println("Calculating area of shape");
    }
}

class Circle_3 extends Shape_3 {
    void area() {
        System.out.println("Area of circle = π * r * r");
    }
}

class Rectangle_3 extends Shape_3 {
    void area() {
        System.out.println("Area of rectangle = length * breadth");
    }
}

 class DynamicBindingDemo {
    public static void main(String[] args) {
        Shape_3 s;

        s = new Circle_3();
        s.area();

        s = new Rectangle_3();
        s.area();             
    }
}
