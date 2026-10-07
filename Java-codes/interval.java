import java.util.Scanner;
public class interval    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long max;
        long min;
            if(a>c)
        {
             max = a;
        }
        else {
            max= c;
        }
        if(b>d){
             min=d;
        }
        else{
             min=b;
        }

        if(max<=min){
            System.out.println(max+" "+min);
        }
        else {
            System.out.println("-1");
        }
        }



    }