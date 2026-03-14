// ANY BASE TO DECIMAL.
import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        System.out.println("Base of Entered Number");
        int b = scn.nextInt();

        int s = 0;
        int k = 1;

        while(n != 0)
        {
            int a = n % 10;
            s = s + a * k;
            k = k * b;
            n = n / 10;
        }

        System.out.print(s);

        scn.close();
    }
}
