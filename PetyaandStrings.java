
import java.util.Scanner;
public class PetyaandStrings {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str1=sc.next();
      String str2=sc.next();
   str1=str1.toLowerCase();
   str2=str2.toLowerCase();
    int ans=str1.compareTo(str2);
    if(ans==0)
    {
        System.out.println("0");
    }
    else if(ans>0)//if string 1 is greater than string 2 it will return positive number
    {
        System.out.println("1");
    }
    else //if string2 is greater than string 1 then it will return negative number
    {
        System.out.println("-1");
    }
    }
    
}
