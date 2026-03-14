// MAXIMUM SUBARRAY SUM USING KADANE'S ALGORITHM
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int s=0;

        for(int i=0;i<a.length;i++)
        {
            s = s + a[i];

            if(s < 0)
            {
                s = 0;
            }

            if(max <= s)
            {
                max = s;
            }
        }

        System.out.println(max);
        scn.close();
    }
}
