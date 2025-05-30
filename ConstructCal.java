 class ConstructCal {
    float a;
    float b;
    ConstructCal() {
        float a=0;
        float b=0;
        System.out.println("The value is 0");
    }
    ConstructCal(float a,float b){
        this.a=a;
        this.b=b;
        float x= a+b;
        System.out.println("Addition is :"+x);
    }
    ConstructCal(float a,float b,String ins){
        this.a=a;
        this.b=b;
        switch(ins){
            case("Add"):
                System.out.println("Addition:"+(a+b));
                break;
            case ("Sub"):
                System.out.println("Subtract:"+(a-b));
                break;
            case("Mul"):
                System.out.println("Multiply:"+(a*b));
                break;
            case ("Div"):
                System.out.println("Divide:"+(a/b));
                break;
            default:
                System.out.println("Invalid command");
        }
    }
}
class Calu{
    public static void main(String[] args) {
        ConstructCal c1= new ConstructCal();
        ConstructCal c2= new ConstructCal(12,23);
        ConstructCal c3=new ConstructCal(235.4F,5,"Sub");
    }
}

