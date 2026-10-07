import java.util.Scanner;
public class Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '.') {
                index = i;
                break;
            }
        }
            int a = Integer.parseInt(s.substring(0, index));
            int b = Integer.parseInt(s.substring(index + 1));
            if(a!=0 && b==0)
            {
                System.out.println("int"+" "+a);
            }
           else
            {
                System.out.println("float"+" "+a+" "+"0."+b);
            }


        }
    }




