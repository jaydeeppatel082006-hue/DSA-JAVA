package PATTERN_PRINTING;

import java.util.Scanner;

public class PATTERN23 {
    /*
                 col

   row          .  .  .  .  1
                .  .  .  2  1
                .  .  3  2  1
                .  4  3  2  1
                5  4  3  2  1


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
            for(col = 1 ; col <= (n-row) ; col += 1 )
            {
                System.out.print("   ");
            }
            //col
            for(col = row ; col >= 1 ; col -= 1 )
            {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
