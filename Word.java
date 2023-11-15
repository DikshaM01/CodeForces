

import java.util.Scanner;
public class Word {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      char ch[]=new char[s.length()];
      for(int i=0;i<ch.length;i++)
      {
          ch[i]=s.charAt(i);
      }
      int countu=0;
      int countl=0;
      for(char c:ch)
      {
          if(Character.isUpperCase(c))
                  {
                      countu++;
                  }
          else if(Character.isLowerCase(c))
          {
              countl++;
          }
      }
      if(countu>countl)
      {
          s=s.toUpperCase();
      }
      else
      {
          s=s.toLowerCase();
      }
      System.out.println(s);
    }
    
}
