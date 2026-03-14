// MAXIMUM SUBARRAY SUM
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int s=0;

                for(int k=i;k<=j;k++)
                {
                    s = s + a[k];
                }

                if(max<=s)
                {
                    max = s;
                }
            }
        }

        System.out.print(max);
        scn.close();
    }
}
