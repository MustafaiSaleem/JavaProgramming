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