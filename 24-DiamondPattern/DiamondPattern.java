import java.util.*;
public class DiamondPattern{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n =8;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            for(int l=2; l<=i; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
         for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n-i; k++){
                System.out.print("*");
            }
            for(int l=2; l<=n-i; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
      
    }
}
