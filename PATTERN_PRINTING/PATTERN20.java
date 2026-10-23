package PATTERN_PRINTING;

import java.util.Scanner;

public class PATTERN20 {
    /*

             col

 row        .  .  .  1
            .  .  2  2
            .  3  3  3
            4  4  4  4


*/
    static void main() {
        int row,col;
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int n = sc.nextInt();

        //row
        for(row = 1 ; row <= n ; row += 1)
        {
            //space
            for(col = 1 ; col <= (n-row) ; col += 1)
            {
                System.out.print("   ");
            }
            //col
            for(col = 1 ; col <= row ; col += 1)
            {
                System.out.print(row + "  ");
            }
            System.out.println();
        }
    }
}
