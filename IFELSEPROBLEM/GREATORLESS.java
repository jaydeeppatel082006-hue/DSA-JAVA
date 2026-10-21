package IFELSEPROBLEM;

import java.util.Scanner;

public class GREATORLESS {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A :");
        int A = sc.nextInt();


        System.out.print("ENTER B :");
        int B = sc.nextInt();


        if(A > B)
        {
            System.out.println("A : " + A + " GRAETOR " + " B : " + B);
        }
        else if (A < B)
        {
            System.out.println("A : " + A + " LESS THEN " + " B : " +B);
        }
        else if (A == B)
        {
            System.out.println("A : " + A + " EQUAL TO " + " B : " +  B);
        }
        else
        {
            System.out.println("FAITAL INPUT");

        }








    }
}
