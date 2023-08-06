import java.util.*; 
public class JavaBasic{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    do {
      System.out.print("Enter Your Number:");
      int num= sc.nextInt();
      if (num% 10==0){
        break;
      }
      System.out.println(num);
    } while (true);
  }
}