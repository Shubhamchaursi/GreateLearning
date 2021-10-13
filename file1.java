import java.util.Scanner;

public class Shubham {
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many number you want");
        int count=scan.nextInt();
      int n1=0,n2=0,n3;

      System.out.print(n1+" "+n2);
      for(int i=0;i<=count;i++)
      {
          n3=n1+n2;
          System.out.print(n3);
          n1=n2;
          n2=n3;
      }
    }
}
