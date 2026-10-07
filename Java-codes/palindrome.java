import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b=a;

        long rev=0;
        while(a>0){
           long rem=a%10;

            rev=rev*10+rem;
            a=a/10;
        }

        if(b==rev){
            System.out.println(rev);
            System.out.println("YES");
        }
        else{
            System.out.println(rev);
            System.out.println("NO");

        }


    }
}

