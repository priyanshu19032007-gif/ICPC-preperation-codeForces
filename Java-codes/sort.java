import java.util.Scanner;
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d=a;
        int e=b;
        int f=c;


        int temp;
        if (a >b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a>c) {
            temp = a;
            a = c;
            c = temp;
        }
        if(c<b){
            temp=c;
            c=b;
            b=temp;


        }



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(" ");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);





    }

}


