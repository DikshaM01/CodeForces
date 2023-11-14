

import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         sc.nextLine();
         for(int i=0;i<n;i++)
         {
             String input=sc.nextLine();
             char str1=input.charAt(0);
             char str2=input.charAt(input.length()-1);
           
             
             int len=input.length();
             if(len>10)
             {
                System.out.print(str1);
                System.out.print(len-2);
                System.out.println(str2);
             }
             else{
                 System.out.println(input);
             }
            
         
         }
    }
    
}
