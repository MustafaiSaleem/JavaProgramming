
public class JavaBasic{
  public static void Swap(int num1,int num2){
   int  temp =num1;
        num1=num2;
        num2=temp;
    System.out.println("Value of Num1: " + num1);
    System.out.println("Value of Num2: " + num2); 
  }

  public static void main(String arg[]){
      int num1=110;
      int num2=50;
      Swap(num1,num2);
  }
}