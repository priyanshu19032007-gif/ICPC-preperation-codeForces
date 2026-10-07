import java.util.Scanner;
public class arrayE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int pos=1;
        for(int j=1;j<n;j++) {
            if (arr[j] < min) {
                min = arr[j];
                pos=j+1;
            }

        }
            System.out.print(min + " " + pos);

    }}

