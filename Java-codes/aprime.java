import java.util.Scanner;
public class aprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        long count;
        long total=0;
        for (int i = 1; i <= a; i++) {
                count=0;
                for(int j=1;j<=i;j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                    if(count==2){
                        System.out.print(i+" ");

                    }
                }


            }
    }


