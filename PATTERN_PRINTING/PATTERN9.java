package PATTERN_PRINTING;

public class PATTERN9 {
    /*

                 col =  5

   row = 5      a  b  c  d  e
                a  b  c  d  e
                a  b  c  d  e
                a  b  c  d  e
                a  b  c  d  e



*/
    static void main() {
        int row,col;
        char cha = 'a';

        //row
        for(row = 1 ; row <= 5 ; row += 1)
        {
            //col
            for(col = 1 ; col <= 5 ; col += 1)
            {
                System.out.print(cha + " ");
                cha = (char) (cha + 1);
            }
            System.out.println();
            cha = 'a';
        }

    }
}
