

import java.util.Scanner;
public class NextRound {

   
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int nums[]=new int[n+1];
     int count=0;
     for(int i=1;i<=n;i++)
     {
         nums[i]=sc.nextInt();
     }
     for(int i=1;i<=n;i++)
     {
         if(nums[i]>0 && nums[i]>=nums[k])
         {
             count++;
         }
     }
     System.out.println(count);
    }
    
}
