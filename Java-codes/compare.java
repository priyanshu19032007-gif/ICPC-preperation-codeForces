import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("\\s+", "");
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '<' || ch == '>' || ch == '=') {
                index = i;
                break;
            }
        }
        long a = Long.parseLong(s.substring(0, index));
        long b = Long.parseLong(s.substring(index + 1));
        char c = s.charAt(index);
        if(c=='>')
        {
            if(a>b) {

                System.out.println("Right");
            }
            else {
                System.out.println("Wrong");
            }
        }
        else if (c=='<')
        {
            if(a<b) {

                System.out.println("Right");
            }
            else {
                System.out.println("Wrong");
            }
        }
        else if (c=='=')
        {
            if(a==b) {

                System.out.println("Right");
            }

            else {
                System.out.println("Wrong");
            }
        }


    }
}