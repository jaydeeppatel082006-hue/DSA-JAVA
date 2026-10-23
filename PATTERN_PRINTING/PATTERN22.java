package PATTERN_PRINTING;
import java.util.Scanner;
public class PATTERN22 {
    /*

                COL

  ROW             .  .  .  .  A
                  .  .  .  A  B
                  .  .  A  B  C
                  .  A  B  C  D
                  A  B  C  D  E


*/
    static void main() {
        int row,col;
        char num = 'A';

        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT N : ");
        int n = sc.nextInt();

        //row
        for(row = 1 ; row <= n ; row+= 1)
        {
            //space
            for(col = 1;col<=(n - row) ; col += 1)
            {
                System.out.print("   ");
            }
            //col
            for(col = 1;col <= row ; col+=1)
            {
                System.out.print(num + "  ");
                num = (char) (num + 1);
            }
            System.out.println();
            num = (char) (num - row);
        }
    }
}
