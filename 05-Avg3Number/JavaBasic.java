import java.util.*;
public class JavaBasic{
    public static float averageOfNumbers(float a, float b, float c){
        float sum= a+ b+ c;
        float average =sum / 3;
        System.out.print("The Average of Three is:" + average);
        return average;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        float num1= sc.nextFloat();
        System.out.println("Enter Second Number: ");
        float num2= sc.nextFloat();
        System.out.println("Enter Third Number: ");
        float num3= sc.nextFloat();
        averageOfNumbers(num1,num2,num3);
        
    }
}

