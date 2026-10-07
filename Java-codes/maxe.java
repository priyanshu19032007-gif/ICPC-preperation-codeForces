import java.util.Scanner;
public class maxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long max=-1;
        for(int i=1;i<=a;i++){
            long b=sc.nextLong();
            if(b>max){
                max=b;
            }


    }
        System.out.println(max);

    }

}



