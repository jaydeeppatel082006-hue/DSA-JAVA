package PATTERN_PRINTING;

import com.sun.jdi.PathSearchingVirtualMachine;

public class PATTERN2 {
//         COL = 5

//           *  *  *  *  *
//  ROW =3   *  *  *  *  *
//           *  *  *  *  *
//


    static void main() {


        //row printing
        for(int row = 1 ; row <= 3 ;row+=1)
        {
            //column printing
            for(int col = 1; col <= 5 ; col+=1)
            {
                System.out.print("* ");
            }
            System.out.println();
        }







    }
}
