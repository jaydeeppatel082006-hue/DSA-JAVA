package PATTERN_PRINTING;

public class PATTERN3 {
    /*
                col = 5

     row = 4     10 10 10 10 10
                 10 10 10 10 10
                 10 10 10 10 10
                 10 10 10 10 10



*/
    static void main() {



        //row
        for(int row = 1 ; row <=4 ;row+=1)
        {
            //col
            for(int col = 1 ; col <=5 ; col += 1)
            {
                System.out.print("10 ");
            }
            System.out.println();

        }
    }
}
