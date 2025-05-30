 //OVERLOADING
class Calculate {
     float a;
     float b;

     Calculate(float a, float b) {
         this.a = a;
         this.b = b;
     }

     public void Cal() {
         System.out.println("Addition:" + (a + b));
         System.out.println("Subtraction:" + (a - b));
         System.out.println("Multiply:" + (a * b));
         if (a > b) {
             float x = a / b;
             System.out.println("Divide:" + x);
         } else {
             float y = b / a;
             System.out.println("Divide:" + y);

         }

     }

 }
class Overloading{
    public static void main(String[] args) {
        Calculate cs = new Calculate(12,23);
        cs.Cal();
    }
}


