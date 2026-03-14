// BUT AND SELL STOCKS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        int[] height={4,2,0,6,3,2,5};
        int n=height.length;

        int[] lmax=new int[height.length];
        int[] rmax=new int[height.length];

        lmax[0]=height[0];
        rmax[n-1]=height[n-1];

        for(int i=1;i<height.length;i++)
        {
            lmax[i]=Math.max(height[i],lmax[i-1]);
        }

        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(height[i],rmax[i+1]);
        }

        int trappedwater=0;

        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(lmax[i],rmax[i]);
            trappedwater=trappedwater + waterlevel - height[i];
        }

        System.out.print(trappedwater);
        scn.close();
    }
}
