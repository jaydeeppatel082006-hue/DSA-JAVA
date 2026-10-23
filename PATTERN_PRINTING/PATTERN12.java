package PATTERN_PRINTING;

public class PATTERN12 {
    /*

        col

row =5   1
         1  2
         1  2  3
         1  2  3  4
         1  2  3  4  5

*/
    static void main() {
        int row,col;

        //row
        for(row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(col = 1 ; col <= row ; col += 1)
            {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
