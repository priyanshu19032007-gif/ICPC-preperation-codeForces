import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            long a = sc.nextLong();
            for (int i = 0; i < a; i++) {
                long b = sc.nextLong();
                long fact = 1;

                for (int k= 1;k<= b; k++) {
                    fact *= k;

                }
                System.out.println(fact);

            }




    }

}



