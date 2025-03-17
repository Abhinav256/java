import java.util.*;
public class Terinary {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a = sc.nextInt();
        System.out.print("Enter the value of b:");
        b = sc.nextInt();
        System.out.print("Enter the value of c:");
        c = sc.nextInt();
        System.out.print("Enter the value of d:");
        d = sc.nextInt();
        int max=(a>b) ? a:b;
        max =(c>max) ? c:max;
        max =(d>max) ? d:max;
        System.out.println("Maximum value is "+max);

        int min = (a<b) ? a:b;
        min = (c<min) ? c:min;
        min = (d<min) ? d:min;
        System.out.println("Minimum value is "+min);

        sc.close();
    }
}
