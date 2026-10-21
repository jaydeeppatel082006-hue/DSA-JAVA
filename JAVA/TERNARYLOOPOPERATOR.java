package JAVA;
import java.util.Scanner;
public class TERNARYLOOPOPERATOR {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("ENTER AGE : ");
       int Age = sc.nextInt();

       String  a = (Age >= 18) ? "ADULT" : "KIDO";
       System.out.println("YOU ARE : "+a);

    }
}
