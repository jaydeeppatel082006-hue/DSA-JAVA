package PATTERN_PRINTING;

public class PATTERN15 {
    /*
             col

  row         a
              b  b
              c  c  c
              d  d  d  d
              e  e  e  e  e


*/
    static void main() {
        int row,col;
        char num = 'a';


        //row
        for(row = 1 ; row <= 5 ;row += 1)
        {
            //col
            for(col = 1 ; col <= row ; col += 1)
            {
                System.out.print(num + "  ");

            }
            System.out.println();
            num = (char) (num + 1);
        }
    }
}
