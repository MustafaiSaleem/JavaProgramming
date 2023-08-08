import java.util.*;
public class JavaBasic{
  public static int Calculator(int num1,int num2){
   int  sum=num1+num2;
    return sum;
  }

  public static void main(String arg[]){
      int num1=110;
      int num2=50;
      int sum =Calculator(num1,num2);
      System.out.println("Sum is: " + sum);

  }
}