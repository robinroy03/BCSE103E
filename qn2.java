import java.util.Scanner;

class qn2 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int digit = sc.nextInt();

                for (int i = 1; i < 11; i++) {
                        System.out.println(digit + " * " + i + " = " + (digit * i));
                }
                sc.close();
        }
}
