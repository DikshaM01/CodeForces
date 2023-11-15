

import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
   
       String[] str=s.split("\\+"); //to store in string array
        int num[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            num[i]=Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        for(int i=0;i<num.length;i++)
        {
            str[i]=String.valueOf(num[i]);
        }
       String result=String.join("+",str);
       System.out.println(result);
    }
    
}
