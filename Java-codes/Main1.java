import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();


        if (a >= 0 && a <= 25) {
            System.out.print("Interval [0,25]");
        } else if (a >= 25 && a <= 50) {
            System.out.print("Interval (25,50]");
        } else if (a >= 50 && a <= 75) {
            System.out.print("Interval (50,75]");
        } else if (a >= 75 && a <= 100) {
            System.out.print("Interval (75,100]");
        } else {
            System.out.print("Out of Intervals");
        }


    }
}