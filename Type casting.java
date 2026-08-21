public class TypeCastingExample {
      public static void main(String[] args) {
   
    //Implicit Type Casting (Widening)
    int num = 100;
    double d = num;   // int to double
  
    System.out.println("Implicit  Type Casting:");
    System.out.println("Integer value: " + num);
    System.out.println("Converted to Double: " + d);

    // Explicit Type Casting (Narrowing)
    double pi = 99.99;
    int value = (int) pi;  // double to int

    System.out.println("\nExplicit Type Casting:");
    System.out.println("Double value: " + pi);
    System.out.println("Converted to Integer: " + value);

    }
}
