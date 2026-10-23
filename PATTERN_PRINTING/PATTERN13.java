package PATTERN_PRINTING;

public class PATTERN13 {
    /*
    col

    row     1
            2  2
            3  3  3
            4  4  4  4
            5  5  5  5  5


    */

    static void main() {
        int row,col;

        //row
        for(row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(col = 1 ; col <= row ; col += 1)
            {
                System.out.print(row + "  ");

            }
            System.out.println();
        }
    }
}
