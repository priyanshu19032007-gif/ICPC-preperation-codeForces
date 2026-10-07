import java.util.Scanner;
public class winter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        float c = (1 - (float) a / 100);
        float d = b / c;
        System.out.printf("%.2f%n",d);
    }
}