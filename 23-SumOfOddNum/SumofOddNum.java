import java.util.*;
public class SumOfOddNum{
    public static int oddNumbers(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i %2==1){
                sum=sum+i;
            }   
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range to Sum of Odd Numbers");
        int input= sc.nextInt();
        int sum=oddNumbers(input);
        System.out.println("The Of from 1 to N is: "+ sum);
    }
}
