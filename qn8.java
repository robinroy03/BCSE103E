import java.util.Scanner;

class qn8 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int one = sc.nextInt();

                System.out.println((one % 2 == 0) ? "Even" : "Odd");

                sc.close();
        }
}
