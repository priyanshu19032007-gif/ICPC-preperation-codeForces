import java.util.Scanner;
public class hidtogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        long a = sc.nextLong();
        for (int i = 1; i <= a; i++) {
            long b = sc.nextLong();

            if (c == '+' || c == '-' || c == '*' || c == '/') {

                for (int j = 1; j <= b; j++) {
                    System.out.print(c);
                }
            }
            System.out.println("");
        }
    }
}

