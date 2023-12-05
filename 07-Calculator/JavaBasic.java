import java.util.*;
public class JavaBasic{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int num1,num2,optr;
        System.out.println("Enter the Oprator \n 1-Add \n 2-Subtract \n 3-divide \n 4-Multiply");
        optr =sc.nextInt();
        System.out.println("Enter First Number");
        num1=sc.nextInt();
        System.out.println("Enter Second Number");
        num2=sc.nextInt();

        int result=0;
        switch (optr) {
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1/num2;
                break;
            case 4:
                result=num1*num2;
                break;
            default:
                System.out.println("Oprator is not Available");
        }

        System.out.println("Resutl :  " + result);
        sc.close();
    }
}