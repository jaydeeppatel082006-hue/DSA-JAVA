package FORlLOOP;

import java.util.Scanner;

public class FACTORIAL1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT  FAC : ");
        int Fac = sc.nextInt();

        for(int i = Fac - 1 ; i >= 1 ; i = i - 1)
        {
            Fac = Fac*i;
        }
        System.out.println("FACTORIAL IS : " + Fac);
    }
}
