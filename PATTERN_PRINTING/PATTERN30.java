package PATTERN_PRINTING;

import java.util.Scanner;

public class PATTERN30 {
    /*

                col = 5

   row = 5      1   2   3   4   5
                6   7   8   9   10
                11  12  13  14  15
                16  17  18  19  20
                21  22  23  24  25


*/

    static void main() {
        int row,col;
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int n = sc.nextInt();

        int num = 1;
        //row
        for(row = 1 ;row <= n ; row += 1)
        {
            //col
            for(col = 1 ; col <= n ; col+= 1)
            {
                System.out.print(num + "  ");
                num = (int) (num + 1);
            }
            System.out.println();
        }

    }
}
