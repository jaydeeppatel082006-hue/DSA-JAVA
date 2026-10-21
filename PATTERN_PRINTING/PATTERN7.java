package PATTERN_PRINTING;

public class PATTERN7 {
    /*

           col = 5

 row = 5   1  4  9  16  25
           1  4  9  16  25
           1  4  9  16  25
           1  4  9  16  25
           1  4  9  16  25



*/
    static void main() {

        //row
        for(int row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(int col = 1 ; col <= 5 ; col += 1)

            {
                System.out.print(col*col + " ");
            }
            System.out.println();
        }
    }
}
