/*import java.util.Scanner;
public class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                index = i;
                break;

            }

        }
        long a = Long.parseLong(s.substring(0, index));
        String b = (s.substring(index + 1));

        int in = -1;
        for (int j = 0; j < b.length(); j++) {
            char c = s.charAt(j);
            if (c == '=') {
                in = j;
                break;
            }
        }
        long e = Long.parseLong(b.substring(0, index));
        long f = Long.parseLong(b.substring(index + 1));
        char op = s.charAt(index);

        if(op == '+') {

        }
        else if(op == '-')
        {
            System.out.println(a-b);
        }
        else if(op == '*')
        {
            System.out.println(a*b);
        }



    }

}*/
