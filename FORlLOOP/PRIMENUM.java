package FORlLOOP;

import java.util.Scanner;

public class PRIMENUM {
    static void main() {
        //  a number which has two factors  and only divisible by 1 and itself is  a prime num

        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT : ");
        int n = sc.nextInt();

        if( n < 2)
        {
            System.out.println( n + "  IS NOT A PRIME NUMBER ");
            return;
        }
        else
        {
            for(int i = 2 ; i < n ; i += 1)
            {
                if( n  % i == 0)
                {
                    System.out.println(n + " is not a prime number");
                    return;
                }
            }

            System.out.println(n + " is a prime num");
            return;

        }









    }
}
