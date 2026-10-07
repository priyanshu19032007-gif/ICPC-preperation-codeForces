import java.util.Scanner;
public class pum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        int num=1;
        for (int i = 1; i <= a; i++) {


                System.out.println(num + " "+(num +1)+" " +(num+2)+" "+"PUM");
                num=num+4;
            }

        }
    }


