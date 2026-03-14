// INVERTED PYRAMID
import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 2*n - 1;
        int sp = 0;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= sp; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= st; j++)
            {
                System.out.print("*");
            }

            st = st - 2;
            sp = sp + 1;

            System.out.println();
        }

        scn.close();
    }
}
