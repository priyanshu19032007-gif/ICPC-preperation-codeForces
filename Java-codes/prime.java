import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("NO");

            }
        else {
            long prime=0;
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    prime++;
                }


            }
            if(prime==2){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }
}

