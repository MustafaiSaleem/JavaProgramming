import java.util.*;
public class JavaBasic{
    public static void main(String arg[]){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter The Number");
      int number=sc.nextInt();
      int sum=0;
      int i=1;
      while(i<=number)
      {
        sum +=i;
        i++;
      }
        System.out.println("The Sum is: " + sum);
        sc.close();
    }
}