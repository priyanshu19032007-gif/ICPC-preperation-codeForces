import java.util.Scanner;
public class alphabat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a>='a'&&a<'z')
        {
            System.out.printf("%c",a+1);
        }
        else if(a=='z'){
            System.out.println("a");
        }



        }

    }