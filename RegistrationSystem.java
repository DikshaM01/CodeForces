


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RegistrationSystem {


    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
 
   Map<String,Integer> map=new HashMap<>();
   sc.nextLine();
   for(int i=0;i<n;i++)
   {
       String input=sc.nextLine();
       if(map.containsKey(input))
       {
           int count = map.get(input);
               count++;
               map.put(input, count);
               System.out.println(input+count);
       }
       else
       {
           System.out.println("OK");
           map.put(input,0);
       }
   }
    }
    
}
