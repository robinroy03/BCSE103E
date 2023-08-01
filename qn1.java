import java.util.Scanner;

class qn1 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);

                int first_digit = sc.nextInt();
                int second_digit = sc.nextInt();
                
                System.out.println("Addition: " +  (first_digit + second_digit));
                System.out.println("Subtraction: " + (first_digit - second_digit));
                System.out.println("Multiplication: " + (first_digit * second_digit));
                System.out.println("Division: " + (first_digit / second_digit));

                sc.close();
        }
}