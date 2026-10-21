package FORlLOOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EVEN {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("INOUT N :");
        int N = sc.nextInt();


        for(int i = 2 ; i <= N ; i+=2)
        {
            System.out.print(i + "  ");
        }

    }



}
