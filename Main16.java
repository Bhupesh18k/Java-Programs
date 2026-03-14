// DECIMAL TO ANY BASE.
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println("Enter Base");
        int b = scn.nextInt();

        int s = 0;
        int k = 1;

        while(n != 0)
        {
            int a = n % b;
            s = s + a * k;
            k = k * 10;
            n = n / b;
        }

        System.out.print(s);

        scn.close();
    }
}
