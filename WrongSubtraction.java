


import java.util.Scanner;
public class WrongSubtraction {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int i=0;
       while(i<k)
       {
       if(n%10!=0)
       {
           n=n-1;
           i++;
       }
       else
       {
           n=n/10;
           i++;
       }
       }
       System.out.println(n);
    }
    
}
