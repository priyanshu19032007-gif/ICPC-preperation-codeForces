import java.util.Scanner;
public class loopR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= 0 || b <= 0) {
                return;

            }
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            int sum = 0;
            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
                sum = sum + i;
            }
            System.out.println("sum =" + sum);

        }
    }
}
