package JAVA;
import java.util.Scanner;


class Switchcase {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("ENTER A: ");
       int a = sc.nextInt();


       System.out.println("ENTER OPERATOR : + - * % /  ");
       String Operator = sc.next();


       System.out.print("ENTER B: ");
       int b = sc.nextInt();


       switch (Operator){
           case "+" :
               System.out.print("OUTPUT : "+(a+b));
               break;

           case "-" :
               System.out.print("OUTPUT : "+(a-b));
               break;
           case "*" :
               System.out.print("OUTPUT : "+(a*b));
               break;
           case "/" :
               System.out.print("OUTPUT : "+(a/b));
               break;
           case "%" :
               System.out.print("OUTPUT : "+(a%b));
               break;
           default:
               System.out.println("INVALID OPERATOR");











       }





    }
}
