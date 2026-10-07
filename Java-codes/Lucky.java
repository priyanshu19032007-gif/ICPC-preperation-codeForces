import java.util.Scanner;
public class Lucky{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int e=a%10;
        int d=a/10;
        if (e==0){
            System.out.println("YES");
        }
        else if(d%e==0||e%d==0)
        {
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
    }
}