// SUM OF TWO ARRAYS
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt();
        int n2=scn.nextInt();

        int a1[]=new int[n1];
        int a2[]=new int[n2];

        for(int i=0;i<a1.length;i++)
        {
            int a=scn.nextInt();
            a1[i]=a;
        }

        for(int i=0;i<a2.length;i++)
        {
            int b=scn.nextInt();
            a2[i]=b;
        }

        int ans[]=new int[n1>n2?n1:n2];
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

            c=sum/10;
            sum=sum%10;
            ans[k]=sum;

            i--;
            j--;
            k--;
        }

        if(c!=0)
        {
            System.out.println(c);
        }
        else
        {
            for(int l=0;l<ans.length;l++)
            {
                System.out.println(ans[l]);
            }
        }

        scn.close();
    }
}
