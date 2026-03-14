// PAIRS IN AN ARRAY
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

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print("(" + a[i] + "," + a[j] + ") ");
            }
        }

        scn.close();
    }
}
