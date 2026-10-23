package PATTERN_PRINTING;

public class PATTERN18 {
    /*
             col

row          5
             5  4
             5  4  3
             5  4  3  2
             5  4  3  2  1

*/
    static void main() {
        int row,col;

        //row
        for(row = 5 ; row >= 1 ; row-= 1)
        {
            //col
            for(col = 5 ; col >= row ; col-=1)
            {
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }
}
