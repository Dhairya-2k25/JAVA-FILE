 class OverrideCal {
    float a;
    float b;
    OverrideCal(float a,float b){
        this.a=a;
        this.b=b;
    }
    void calculate(){
        float x= a+b;
        System.out.println("Addition of two numbers is:"+x);
    }
}
class Cal extends OverrideCal {

    Cal(float a, float b) {
        super(a, b);
    }
    void calculate(){
        System.out.println("The Addition of this is:"+(a+b));
        System.out.println("Overriding successful");
    }

}
class Main{
    public static void main(String[] args) {
        Cal c1=new Cal(12,3);
        c1.calculate();
    }
}
