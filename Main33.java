// BUBBLE SORT
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

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j] > a[j+1])
                {
                    int c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
