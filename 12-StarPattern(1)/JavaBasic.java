import java.util.*; 
public class JavaBasic{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    for (int line=0;line<4;line++)
    {
      for (int star=0;star<=line;star++)
      {
        System.out.print("*");
        
      }
      System.out.println();
    }
    
  }
}