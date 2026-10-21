package FORlLOOP;

import java.util.Scanner;

public class POWEROFANUM {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // number
        System.out.println("ENTER NUMBER : ");
        int n = sc.nextInt();
        // power of a number
        System.out.println("ENTER POWER : ");
        int pow = sc.nextInt();

        //initialize the number
        int num = n;

        for(int i = 1 ; i < pow ; i += 1)
        {
             num = num * n;

        }
        System.out.println(num);


    }
}
