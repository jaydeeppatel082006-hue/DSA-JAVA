package PATTERN_PRINTING;

public class PATTERN6 {
    /*

           col = 5

 row = 5   5  4  3  2  1
           5  4  3  2  1
           5  4  3  2  1
           5  4  3  2  1
           5  4  3  2  1


*/
    static void main() {


        //row
        for(int row = 1 ; row <= 5 ; row+= 1)
        {
            //col
            for(int col = 5 ; col >= 1;col-=1)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
