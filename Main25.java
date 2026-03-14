import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=1;
        int st=3;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=st;j++)
            {
                System.out.print("*\t");
            }

            for(int j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }

            for(int j=1;j<=st;j++)
            {
                System.out.print("*\t");
            }

            if(i<=n/2)
            {
                sp=sp+2;
                st=st-1;
            }
            else
            {
                sp=sp-2;
                st=st+1;
            }

            System.out.println();
        }

        scn.close();
    }
}
