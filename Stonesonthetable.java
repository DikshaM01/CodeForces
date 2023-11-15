

import java.util.Scanner;
public class Stonesonthetable {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String s=sc.next();
       int count=0;
       for(int i=0;i<n-1;i++)
       {
           char x=s.charAt(i);
           char y=s.charAt(i+1);
           if(x==y)
           {
               count++;
           }
       }
       System.out.println(count);
    }
    
}
