import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        char s = scanner.next().charAt(0);
        long b = scanner.nextLong();
        char q = scanner.next().charAt(0);
        long c = scanner.nextLong();

        long actualResult = 0;

        if (s == '+') {
            actualResult = a + b;
        } else if (s == '-') {
            actualResult = a - b;
        } else if (s == '*') {
            actualResult = a * b;
        }

        if (actualResult == c) {
            System.out.println("Yes");
        } else {
            System.out.println(actualResult);
        }

        scanner.close();
    }
}
