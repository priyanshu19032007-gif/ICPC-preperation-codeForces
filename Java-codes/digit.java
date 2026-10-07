import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long rem,rev=0;
        for (int i = 1; i <= a; i++) {
            long b = sc.nextLong();
            //System.out.println(b);
          do {
              rem = b % 10;
              System.out.print(rem + " ");
              b = b / 10;
          }while(b>0);

            System.out.println();


        }
    }
}

