import java.util.Scanner;

class qn3 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                long minutes = sc.nextInt();

                // one day has 1440 minutes

                long days = minutes / 1440;
                System.out.println("Number of Days: " + days);

                System.out.println("Number of Years: " + days / 365);

                sc.close();
        }
}