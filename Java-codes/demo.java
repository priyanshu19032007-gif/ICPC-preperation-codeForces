import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        if (sc.hasNextInt()) {
            int t = sc.nextInt();


            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                long factorial = 1;


                for (int j = 1; j <= n; j++) {
                    factorial *= j;
                }


                System.out.println(factorial);
            }
        }
        sc.close();
    }
}