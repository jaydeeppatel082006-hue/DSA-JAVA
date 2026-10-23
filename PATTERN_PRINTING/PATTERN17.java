package PATTERN_PRINTING;

public class PATTERN17 {
    /*

               col

  row          1  2  3  4  5
               1  2  3  4
               1  2  3
               1  2
               1

*/
    static void main() {
        int row,col;
        int n = 5;

        //row
        for(row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(col = 1 ; col <= n ; col += 1)
            {
                System.out.print(col + " ");
            }
            System.out.println();
            n = (int) (n - 1);
        }
    }
}
