

import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int i=0;i<t;i++)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int one=a+b;
       int sec=b+c;
       int thi=a+c;
       if((one==c)||(sec==a)||(thi==b))
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
   }
      }
    
}
