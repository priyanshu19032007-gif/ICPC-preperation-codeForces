import java.util.Scanner;
public class passward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       for(int i=0; ;i++){
           int a = sc.nextInt();
           if(a==1999){
               System.out.println("Correct");
               break;

           }
           else{
               System.out.println("Wrong");

           }
       }

    }

}


