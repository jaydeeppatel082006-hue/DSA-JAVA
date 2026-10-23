package PATTERN_PRINTING;

public class PATTERN11 {
    /*

        col

 row =5   *
          *  *
          *  *  *
          *  *  *  *
          *  *  *  *  *




*/
    static void main() {
        int col,row;

        //row
        for(row = 1 ; row <= 5 ; row+=1)
        {
            //col
            for(col = 1 ; col <= row ; col+=1)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

