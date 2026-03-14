// WAP TO CHECK WHETHER ENTERED NUMBER IS PALINDROME OR NOT.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = n;
        int s = 0;

        scn.close();

        while(n != 0) {
            int a = n % 10;
            s = s * 10 + a;
            n = n / 10;
        }

        if(k == s) {
            System.out.println("Entered Number is Palindrome");
        }
        else {
            System.out.println("Entered Number is not Palindrome");
        }
    }
}
