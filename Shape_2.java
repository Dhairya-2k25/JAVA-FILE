class Shape_2{
    void display(){
        System.out.println("The Area of shape");
    }
}

class Circle_2 extends Shape_2{
    final float pi=3.14F;
    void display(int r) {
        super.display();
        float A2=pi*r*r;
        System.out.println("Area of Circle"+A2);
    }
}

class Rectangle_2 extends Shape_2{
    void display(int l,int b){
        super.display();
        int A2=l*b;
        System.out.println("Area of Rectangle"+A2);
    }
}

class Area_2{
    public static void main(String[] args) {
        Circle_2 c2=new Circle_2();
        Rectangle_2 r2=new Rectangle_2();
        c2.display(10);
        r2.display(10,10);
    }
}