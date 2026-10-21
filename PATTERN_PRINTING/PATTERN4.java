package PATTERN_PRINTING;

public class PATTERN4 {
    /*

            col = 5

  row = 5    1 1 1 1 1
             2 2 2 2 2
             3 3 3 3 3
             4 4 4 4 4
             5 5 5 5 5





*/
    static void main() {


        //row
        for(int row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(int col = 1 ; col <=5 ; col+= 1)
            {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
