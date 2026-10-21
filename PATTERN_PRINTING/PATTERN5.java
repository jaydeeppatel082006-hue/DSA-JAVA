package PATTERN_PRINTING;

public class PATTERN5 {
    /*
             col = 5

  row = 5    1  2  3  4  5
             1  2  3  4  5
             1  2  3  4  5
             1  2  3  4  5
             1  2  3  4  5




*/
    static void main() {
        //row
        for(int row = 1 ; row <= 5 ; row+=1)
        {
            //col
            for(int col = 1 ; col <=5 ; col += 1)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
