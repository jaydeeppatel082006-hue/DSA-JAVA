package IFELSEPROBLEM;

import java.util.Scanner;

public class VOTE {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YOUR AGE: ");
        int Age = sc.nextInt();

        if ((Age >= 0) & (Age < 18))
        {
            System.out.println("YOUR NOT ELIGIBLE TO VOTE");
        }
        else if (Age < 0)
        {
            System.out.println("FAITAL INPUT");


        }
        else
        {

            System.out.println("YOU ARE ELIGIBLE TO VOTE");

        }


        sc.close();

    }
}
