import java.util.*;
public class JavaBasic{
  public static int factorial(int num){
  int fact=1;
  for(int i=1;i<=num;i++)
  {
    fact=fact*i;
  }
  return fact;
  }
  public static void main(String arg[]){
    System.out.println(factorial(3));
  }
}

// USING BigInteger for Big number of result

// import java.util.*;
// import java.math.BigInteger;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = 100;

//         for (int i = 1; i <= num; i++) {
//             BigInteger fac = BigInteger.ONE; // Use BigInteger

//             for (int j = 1; j <= i; j++) {
//                 fac = fac.multiply(BigInteger.valueOf(j)); // Multiply using BigInteger
//             }

//             System.out.println("Factorial of " + i + " is: " + fac);
//         }
//     }
// }
