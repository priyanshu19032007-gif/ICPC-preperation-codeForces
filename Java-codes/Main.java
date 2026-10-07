
/*import java.util.Scanner;
public class Main {
     public static void main(String[] args){
         int a=5;
          int b=10;
    // System.out.println("hello world");
     //System.out.println(a + " ");
     //System.out.println(b + " ");
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();
     //System.out.print(age);
     long phone = sc.nextLong();
     char grade = sc.next().charAt(0);
     float height = sc.nextFloat();
     double salary = sc.nextDouble();
     String name= sc.next();
          System.out.println(age);
          System.out.println(phone);
          System.out.println(grade);
          System.out.println(height);
          System.out.println(salary);
          System.out.println(name);

     }
}
import java.util.Scanner;
          public class Main{
               public static void main(String[] args)
               {
                    Scanner sc = new Scanner(System.in);
                    String S = sc.next();
                    System.out.println("Hello, "+S);

               }
          }
import java.util.Scanner;
     public class Main{
         public static void main(String[]args)
         {
             Scanner sc= new Scanner(System.in);
                     int a=sc.nextInt();
             long b=sc.nextLong();
             char c=sc.next().charAt(0);
             float d=sc.nextFloat();
             double e=sc.nextDouble();
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
             System.out.println(d);
             System.out.println(e);

         }

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong();
        long b=sc.nextLong();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " - " + b + " = " + (a-b));
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long b=sc.nextLong();
    long c=sc.nextLong();
    long d=sc.nextLong();
    long e= ((a*b)-(c*d));
    System.out.println("Difference = " +e);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float s= a*a;
        double r =(double) (3.141592653*s);
        System.out.println(r);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b= sc.nextLong();
        long c= a%10;
        long d= b%10;
        long e= c+d;
        System.out.println(e);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong();
        long s=a*(a+1)/2;

      System.out.println(s);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a >= b) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a%b==0||b%a==0) {
            System.out.println("Multiples");
        }
        else
            System.out.println("No Multiples");

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c= sc.next();
        String d= sc.next();
        if(b.equals(d))
        {
            System.out.println("ARE Brothers");

        }
        else
            System.out.println("NOT");

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       char a = sc.next().charAt(0);
       if(a>='0'&&a<='9') {
           System.out.println("IS DIGIT");
       }
       else
           System.out.println("ALPHA");
         if(a>='A'&& a<='Z') {
             System.out.println("IS CAPITAL");
         }
          else if(a>='a'&& a<='z'){
             System.out.println("IS SMALL");
         }


    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            ch -= 32;

        } else if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
//System.out.println(ch);

        }
        System.out.println(ch);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String s = sc.next();
        long b = sc.nextLong();
        char ch = s.charAt(0);
        switch (ch) {if(a.contains("+"))
        {
        a.substring(0,indexof("+"));
        a.substring(indexof("+")+1);
 *


            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
       // int s = 0;
        for (int i = 0; a>=10; i++) {
            a = a / 10;
        }
            //System.out.println(a);


        if (a % 2 == 0) {
           System.out.println("EVEN");

        }
        else
            System.out.println("ODD");
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a=='+' && b=='+')
            System.out.println("Q1");
        if(a=="-"&& b=="+")
            System.out.println("Q2");
        if(a=="-" && b=='-')
            System.out.println("Q3");
        if(a=='+'&& b=='-')
            System.out.println("Q4");
    */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long max = a;
        long min = a;


        if (b>max) {
            max = b;
        }
        if (c>max) {
            max = c;

        }
        if (b<min) {
            min = b;
        }
        if(c<min) {
            min = c;
        }


        System.out.print(min+" ");
        System.out.print(max);

}}

