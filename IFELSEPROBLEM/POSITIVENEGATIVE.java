package IFELSEPROBLEM;

import java.util.Scanner;

public class POSITIVENEGATIVE {
    static void main(String[] args) {
        Scanner fd = new Scanner(System.in);


        System.out.print("ENTER A NUMBER : ");
         java.lang.Double Num = fd.nextDouble();


        if(Num  < 0)
        {
            System.out.println( Num + "  IS NEGATIVE ");
        }
        else if (Num > 0)
        {
            System.out.println( Num + "  IS POSITIVE");
        }
        else if (Num == 0)
        {
            System.out.println(Num + "  IS ZERO");
        }
        else
        {
            System.out.println("WRONG INPUT");


        }

    }
}
