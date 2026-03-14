// TARGETED SUM 
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int target=scn.nextInt();
        int nums[];
        nums=new int[n];

        for(int i=0;i<n;i++)
        {
            int a=scn.nextInt();
            nums[i]=a;
        }

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+nums[i+1]==target)
            {
                System.out.print(i+" "+(i+1));
            }
        }

        scn.close();
    }
}
