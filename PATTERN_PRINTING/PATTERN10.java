package PATTERN_PRINTING;

public class PATTERN10 {
    /*

                col = 5

   row = 5      1   2   3   4   5
                6   7   8   9   10
                11  12  13  14  15
                16  17  18  19  20
                21  22  23  24  25


*/
    static void main() {
        int row ,col;
        int num = 1;


        //row
        for(row = 1 ; row <=5 ; row += 1)
        {
            //col
            for(col = 1 ; col <= 5 ; col += 1)
            {
                System.out.print(num + " ");

                num = (int) (num + 1);
            }
            System.out.println();
        }
    }
}
