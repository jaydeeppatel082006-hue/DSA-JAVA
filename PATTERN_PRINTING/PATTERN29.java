package PATTERN_PRINTING;

import java.util.Scanner;

public class PATTERN29 {
    /*





part 1

1                                    *
2                                  *   *
3                                *   *   *
4                              *   *   *   *
4                              *   *   *   *
3                                *   *   *
2                                  *   *
1                                    *


part 2

*/
    static void main() {
        int row ,col;
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int n = sc.nextInt();


        //part first

        //row
        for( row = 1 ; row <= n ; row += 1)
        {
            //space
            for (col = 1 ; col <= (n-row) ; col += 1)
            {
                System.out.print(" "); //only one time space if we gave two spaces then star is below the star
            }
            //col
            for(col = 1 ; col <= row ; col += 1)
            {
                System.out.print("* ");
            }
            System.out.println();


        }

        //part second
        //row
        for(row  = n ; row >= 1 ; row -= 1)
        {

            //space
            for (col = 1 ; col <= (n -row) ;col += 1) //only one time space if we gave two spaces then star is below the star
            {
                System.out.print(" ");
            }
            //col
            for(col = row ; col >= 1 ; col -= 1)
            {
                System.out.print("* ");
            }
            System.out.println();
        }





























































    }





}
