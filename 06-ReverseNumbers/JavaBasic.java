public class JavaBasic{
    public static void main(String arg[]){
      int n=7577893;
      while(n>0)
      {
        int d = n%10;
        System.out.print(d);
        n=n/10;
      }
    }
}