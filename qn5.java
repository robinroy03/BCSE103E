import java.util.Scanner;

class qn5 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int rows = sc.nextInt();

                int digit = 1;

                for (int i = 1; i <= rows; i++) {
                        for (int j = 0; j < i; j++) {
                                System.out.print(digit + " ");
                                digit++;
                        }
                        System.out.println();
                }
                sc.close();
        }
}