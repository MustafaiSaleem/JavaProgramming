



import java.util.*;
public class Solution{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int data = 4;
        //upper case 
        for (int loop1=1; loop1<=data; loop1++){
            //part 1
            for(int loop2=1; loop2<=loop1; loop2++){
                System.out.print("*");
            }
            //for sapces
            int spaces = 2*(data-loop1);
            for(int loop3=1; loop3<=spaces; loop3++){
                System.out.print(" ");
            }

            //part 2
            for (int loop2=1; loop2<=loop1; loop2++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
        //lower case
        for(int loop1=0; loop1<=data; loop1++){
            //part 1
            for(int loop2=1; loop2<=data-loop1; loop2++){
                System.out.print("*");
            }
            //for spaces
            int space=2*loop1;
            for(int loop3=1; loop3<=space; loop3++){
                System.out.print(" ");
            }
            //part 2
            for(int loop2=1; loop2<=data-loop1; loop2++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
        
    }
}

