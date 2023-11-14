


import java.util.Scanner;
public class Bit {

   
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int X=0;
     sc.nextLine();
     int ans=0;
     String str1="X++";
     String str2="++X";
     String str[]=new String[n];
     for(int i=0;i<n;i++)
     {
       str[i]=sc.next (); 
     }
     for(int i=0;i<n;i++)
     {
         String input=str[i];
         if(input.equals(str1)|| input.equals(str2))
         {
            X=X+1; 
         }
         else{
             X=X-1;
         }
     }
     System.out.println(X);
    }
    
}
