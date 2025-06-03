import java.util.*;
abstract class Shape{
   abstract void area();
}
class Circle_1 extends Shape{
    final double pi=3.14;
    int r;
    Circle_1(int r){
        this.r=r;
    }

    public void area(){
        double  A= pi*r*r;
        System.out.println("The area of Circle is:"+A);
    }
}

class Rectangle_1 extends Shape{
    int l;
    int b;
    Rectangle_1(int l,int b){
        this.l=l;
        this.b=b;
    }

    public void area(){
        int A= l*b;
        System.out.println("The Area of Rectangle is :"+A);
    }
}

class Area{
    public static void main(String[] args) {
        Circle_1 c1=new Circle_1(12);
        Rectangle_1 r1=new Rectangle_1(10,10);
        c1.area();
        r1.area();

    }
}