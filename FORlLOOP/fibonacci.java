package FORlLOOP;

import java.util.Scanner;

public class fibonacci {
    static void main() {
        // fib =  0   1   1   2   3   5    8  13   21
        //index = 1   2   3   4   5   6    7  8    9
             // 0 == last
        // 1 == prev
        //current ==


        Scanner sc = new Scanner(System.in);

        int  last = 0, prev = 1,curr;


        System.out.print("ENTER NTH FIB SERIES : ");
        int n = sc.nextInt();

        if( n == 1)
        {
            System.out.print(last);
        }
        if(n == 2)
        {
            System.out.print(last + " " + prev);
        }

        // if n != 1 or 2 then print

        System.out.print(last + " " + prev);


        for(int i = 3 ; i<= n ; i += 1)
        {
            curr = last + prev;
            System.out.print(" " + curr);
             last = prev;
             prev = curr;
        }


    }
}
