import java.util.*;
public class JavaBasic{
    public static void main(String arg[]){
        Scanner  sc= new Scanner (System.in);
      float num1,num2,num3;
      System.out.println("Enter Three Number's");
      num1=sc.nextInt();
      num2=sc.nextInt();
      num3=sc.nextInt();
      float average=(num1+num2+num3)/3;
      System.out.println("The Average Of Given Numbers is:  " + average); 
    }
}