// SPAN OF AN ARRAY
// SPAN OF TWO ARRAY
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();

        int[] a1=new int[n1];
        int[] a2=new int[n2];

        for(int i=0;i<a1.length;i++)
        {
            a1[i]=scn.nextInt();
        }

        for(int i=0;i<a2.length;i++)
        {
            a2[i]=scn.nextInt();
        }

        int[] ans=new int[n1>n2?n1:n2];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=ans.length-1;
        int c=0;

        while(k>=0)
        {
            int sum=c;

            if(i>=0)
            {
                sum=sum+a1[i];
            }

            if(j>=0)
            {
                sum=sum+a2[j];
            }

            ans[k]=sum%10;
            c=sum/10;
            i--;
            j--;
            k--;
        }

        if(c!=0)
        {
            System.out.println(c);
        }

        for(int l=0;l<ans.length;l++)
        {
            System.out.println(ans[l]);
        }

        scn.close();
    }
}
