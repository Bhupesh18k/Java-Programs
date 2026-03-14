// count how many times a digit appears in a number
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = 0;

        while(n != 0)
        {
            int a = n % 10;

            if(a == r)
            {
                c++;
            }

            n = n / 10;
        }

        System.out.print(c);

        scn.close();
    }
}
