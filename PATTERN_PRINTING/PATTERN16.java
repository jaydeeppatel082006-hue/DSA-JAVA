package PATTERN_PRINTING;

public class PATTERN16 {
    /*
                   col

      row          *  *  *  *  *
                   *  *  *  *
                   *  *  *
                   *  *
                   *
*/


    static void main() {
        int row,col;

        //row
        for(row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(col = row ; col <= 5 ; col+=1)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
