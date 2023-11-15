

import java.util.Scanner;
public class Translation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
       String t=sc.next();
       String s1="";
       for(int i=t.length()-1;i>=0;i--)
       {
           s1=s1+t.charAt(i);
       }
       if(s.equals(s1))
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
    }
    
}
