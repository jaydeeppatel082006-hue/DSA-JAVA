package PATTERN_PRINTING;

public class PATTERN1 {
//
//            col
//
//    row     * * * *
//            * * * *
//            * * * *
//            * * * *

    static void main() {

  int n = 5;


      // outer loop for rows

        for(int i = 1; i <= n ; i+=1)
        {
            //inner loop column
            for(int j = 1 ; j <= n ; j+=1)
            {
                System.out.print(" * "); // print star

            }
            System.out.println();



        }













    }

    }