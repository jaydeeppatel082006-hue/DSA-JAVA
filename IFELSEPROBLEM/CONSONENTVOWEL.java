package IFELSEPROBLEM;

import java.util.Scanner;

public class CONSONENTVOWEL {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ALPHABET : ");
        char Alpha = sc.next().charAt(0);
        // VOWEL A E I O U
        if((Alpha == 'A') || (Alpha == 'a'))
        {
            System.out.println("VOWEL");
        }
        else if((Alpha == 'E') || (Alpha == 'e'))
         {
             System.out.println("VOWEL");
         }
        else if((Alpha == 'I') || (Alpha == 'i'))
         {
             System.out.println("VOWEL");
         }
        else if((Alpha == 'O') || (Alpha == 'o'))
         {
             System.out.println("VOWEL");
         }
        else if((Alpha == 'U') || (Alpha == 'u'))
         {
             System.out.println("VOWEL");
         }
        else
        {
            System.out.println("CONSONENT");

        }







    }
}
