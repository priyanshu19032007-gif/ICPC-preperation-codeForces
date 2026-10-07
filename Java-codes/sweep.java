import java.util.Scanner;
public class sweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long len=(b-a)+1;
        float e= (len+1)/2;
        float f= (len-1)/2;
          if(a==0&&b==0) {
              System.out.println("NO");
          }
          else if(e==3 && f==2){
                System.out.println("YES");

          }
          else if(Math.abs(a-b)<=1){
                System.out.println("YES");

            }


         // else if(a<b){
//System.out.println("NO");
           // }

          else {
                System.out.println("NO");
            }





    }
}