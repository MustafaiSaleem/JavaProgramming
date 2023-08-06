import java.util.*; 
public class JavaBasic{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A Number");
    int num=sc.nextInt();
    int flag=0;
    for ( int i=2;i<num;i++)
    {
      if (num%i==0)
      {
          flag=1;
          break;
      }

    }
    if(flag==0)
    {
      System.out.println("The Given Number is Prime ");
    }
    else{
      System.out.println("The Given Number is Not Prime");
    }
    
  }
}