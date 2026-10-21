package IFELSEPROBLEM;

import java.util.Scanner;

public class WEEKDAYS {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("ENTER A NUMBER B/W  1 to 7 : " );
        int Days = sc.nextInt();



        if( Days == 1)
        {
            System.out.println("MONDAY");
        }
        else if(Days == 2)
        {
            System.out.println(" TUESDAY    ");
        }
        else if(Days == 3)
        {
            System.out.println(" WEDNESDAY    ");
        }
        else if(Days == 4)
        {
            System.out.println("  THUSDAY   ");
        }
        else if(Days ==  5)
        {
            System.out.println("  FRIDAY   ");
        }
        else if(Days == 6 )
        {
            System.out.println(" SATURDAY    ");
        }
        else if(Days == 7 )
        {
            System.out.println(" SUNDAY    ");
        }
        else
        {
            System.out.println("WRONG INPUT");
        }



    }
}
