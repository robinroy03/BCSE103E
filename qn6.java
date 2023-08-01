import java.util.Scanner;

class qn6 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int rows = sc.nextInt();

                for (int i = 1; i <= rows; i++) {
                        System.out.print(spaces(rows - i));
                        for (int j = 0; j < i; j++) {
                                System.out.print("@");
                        }
                        System.out.println();
                }
                sc.close();
        }

        public static String spaces(int index) {
                String space = " ";
                for (int i = 0; i < index; i++) {
                        space += " ";
                }
                return space;
        }
}
