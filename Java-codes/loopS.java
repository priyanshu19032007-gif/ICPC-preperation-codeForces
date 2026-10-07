import java.util.Scanner;
public class loopS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
           for(int i=1;i<=a;i++) {
               int b = sc.nextInt();
               int c = sc.nextInt();

               int min = Math.min(b, c);
               int max = Math.max(b, c);
               int sum =0;

            for (int j = min+1; j <max; j++) {
                if (j % 2 != 0) {
                    sum = sum + j;



                }
            }
            System.out.println(sum);

            }


        }
    }

