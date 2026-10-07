import java.util.Scanner;
public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<2) {
            System.out.println(-1);
        }
        else {
            for (int i = 2; i <= a; i = i + 2) {
                System.out.println(i);

            }
        }


        }
    }

