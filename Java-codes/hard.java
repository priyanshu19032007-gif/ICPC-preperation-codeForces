import java.util.Scanner;

public class hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
       // double val1= Math.pow(a,b);
       // double val2= Math.pow(c,d);

       double val1 = b * Math.log(a);
       double val2 = d * Math.log(c);

        if (val1 > val2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
