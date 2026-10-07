import java.util.Scanner;
public class arrayB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int pos =-1;
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                pos=i;
                break;

            }
        }
        System.out.println(pos);













    }}



