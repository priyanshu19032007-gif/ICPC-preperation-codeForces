import java.util.Scanner;
public class allprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>1){
            long prime=0;
            for(int i=1;i<=a;i++){
                if(a%i==0){
                    prime++;
                }
                System.out.println(prime);

            }
            System.out.println(prime);


    }
}}


