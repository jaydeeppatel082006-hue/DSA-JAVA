package IFELSEPROBLEM;

import java.util.Scanner;

public class EVENODD {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("INPUT : ");
        int Num = sc.nextInt();


        if (Num % 2 == 0)
        {
            System.out.println(Num + "  IS EVEN");

        }
        else if (Num % 2 == 1)
        {
            System.out.println(Num + " IS ODD");
        }
        else
        {
            System.out.println("WRONG INPUT");
        }

        sc.close();
    }
}
