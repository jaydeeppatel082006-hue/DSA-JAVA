package FORlLOOP;

import java.util.Scanner;

public class NUMBERJUMP {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int N = sc.nextInt();

        System.out.print("NUMBER JUMP : ");
        int Num = sc.nextInt();


        for (int i = 1; i <= N; i += Num) {
            System.out.println(i);
        }
    }


}


