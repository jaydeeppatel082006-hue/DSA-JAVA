package PATTERN_PRINTING;

public class PATTERN14 {
    /*
            col


 row        1
            2  1
            3  2  1
            4  3  2  1
            5  4  3  2  1

*/


    static void main() {
        int row ,col;


        //row
        for(row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(col = row ; col >= 1 ; col -= 1)
            {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
