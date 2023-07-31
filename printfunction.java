import java.util.Scanner;

// A sample demonstration on taking I/O using Scanner class.

public class printfunction{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String no;
    no = sc.nextLine();
    System.out.println(no);
    sc.close();
  }
}
