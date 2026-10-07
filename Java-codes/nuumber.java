import java.util.Scanner;
public class nuumber   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();


        long f=(a*b)%100;
        f=(f*c)%100;
        f=(f*d)%100;


                System.out.println(f);


}}