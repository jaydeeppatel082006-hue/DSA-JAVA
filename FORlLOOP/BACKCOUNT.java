package FORlLOOP;
 import java.util.Scanner;
public class BACKCOUNT {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("INPUT N : ");
        int N = sc.nextInt();


        for(int A = N ; A >= 1 ; A = A - 1)
        {
            System.out.print(A + " " );
        }




    }
}
