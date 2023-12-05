import java.util.*;
public class JavaBasic{
    public static void main(String arg[]){
      Scanner sc= new Scanner(System.in);
      for(int i=1;i<=4;i++)
      {
      if (i==3)
        {
          break;
        }
        System.out.println(i);
    }
       System.out.println("Out From The  Loop");
       sc.close();

  }

}