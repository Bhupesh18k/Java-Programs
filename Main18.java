// ANY BASE TO ANY BASE
import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int power = 1;
        int decimal = 0;

        while(n != 0)
        {
            int digit = n % 10;
            decimal += digit * power;
            power *= b1;
            n /= 10;
        }

        int result = 0;
        int place = 1;

        while(decimal != 0)
        {
            int digit = decimal % b2;
            result += digit * place;
            place *= 10;
            decimal /= b2;
        }

        System.out.print(result);

        scn.close();
    }
}
