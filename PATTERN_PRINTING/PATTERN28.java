package PATTERN_PRINTING;

import java.util.Scanner;

public class PATTERN28 {
    /*

part 1                col


 1       row         *  .  .  .  .  .  .  *
 2                   *  *  .  .  .  .  *  *
 3                   *  *  *  .  .  *  *  *
 4                   *  *  *  *  *  *  *  *
 3                   *  *  *  .  .  *  *  *
 2                   *  *  .  .  .  .  *  *
 1                   *  .  .  .  .  .  .  *


part 2



     */


    static void main() {
        int row ,col;

        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int n = sc.nextInt();

        //first part

        //row
        for(row = 1 ; row <=n ; row+=1)
        {
            //col1
            for (col = 1 ; col <= row ; col += 1)
            {
                System.out.print("*  ");
            }
            //space
            for(col = 1 ; col <= 2*(n - row ); col += 1)
            {
                System.out.print("   ");
            }
            //col2
            for (col = 1 ; col <= row ; col += 1)
            {
                System.out.print("*  ");
            }
            System.out.println();





        }

        //second part

        //row

        for (row = n ; row >= 1 ; row -= 1)
        {
            //col 1
            for (col = row ; col >= 1 ; col -= 1)
            {
                System.out.print("*  ");
            }
            //space
            for (col = 1 ; col <= 2*(n - row) ; col += 1 )
            {
                System.out.print("   ");
            }
            //col2
            for(col = row ; col >= 1 ; col -= 1)
            {
                System.out.print("*  ");
            }
            System.out.println();
















        }
























































    }


}
