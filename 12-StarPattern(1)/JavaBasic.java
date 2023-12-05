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
    sc.close();
    
  }
}

////////////////// With recurnsion //////////////////////////////

// import java.util.*;
// public class Solution{
//     public static void starPattern(int row, int col, int size){
//         if(row > size){
//             return;
//         }
//         if(col < row){
//             System.out.print("*");
//             starPattern(row, col+1, size);
//         }else{
//             System.out.println();
//             starPattern(row + 1, col = 0, size);
//         }
//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("\n Enter the size");
//         int row = 0;
//         int col = sc.nextInt();
//         int size = col;
        
//         starPattern(row, col,size);
//     }
// }


// output -:
// *
// **
// ***
// ****