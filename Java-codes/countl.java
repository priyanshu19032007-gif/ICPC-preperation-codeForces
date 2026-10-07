import java.util.Scanner;
public class countl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();

                if (b >0) {
                    pos++;
                } else if(b<0) {
                    neg++;

                }
                if (b % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }

            System.out.println("Even:" + " "+even);
            System.out.println("Odd:" +" "+ odd);
            System.out.println("Positive:" + " "+pos);
            System.out.println("Negative:" + " "+ neg);


        }

    }



