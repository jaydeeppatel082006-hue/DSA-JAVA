package PATTERN_PRINTING;

import java.util.Scanner;

public class PATTERN26 {
    /*
  col

row       *  *  *  *  *  *  *  *  *
          .  *  *  *  *  *  *  *  .
          .  .  *  *  *  *  *  .  .
          .  .  .  *  *  *  .  .  .
          .  .  .  .  *  .  .  .  .


*/
    static void main() {
        int row,col;

        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int n = sc.nextInt();

        //row
        for(row = n ; row >= 1 ; row -= 1)
        {
            //space
            for(col = 1 ; col <= (n - row) ; col += 1)
            {
                System.out.print("   ");
            }
            //col
            for(col = 1 ; col <= (2 * row - 1); col += 1)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }


}
