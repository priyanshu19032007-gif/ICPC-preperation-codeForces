import java.util.Scanner;
public class luckyn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        boolean isLucky = true;
        long e=0;
        boolean found = false;
      for(long i=a;i<=b;i++){
          long z=i;
          isLucky=true;
       while(z>0){
           e=z%10;
           if(e!=4&&e!=7){
               isLucky = false;
               break;
           }
           z = z/10;
       }
        if(isLucky==true){
            System.out.print(i+" ");
            found = true;
        }
        }
      if(!found) {
          System.out.println("-1");

       }



    }
}

