import java.util.*; 
public class JavaBasic{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
   int num=4;
   for (int line=0;line<num;line++)
   {
    for(int star=1;star<num-line+1;star++)
    {
      System.out.print("*");

    }
    System.out.println();
   }
   sc.close();
  }
}