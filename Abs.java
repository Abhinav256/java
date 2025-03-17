import java.util.*;
public class Abs {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        c=a+b;
        d=a-b;
        if (c<0){
            c=c*-1;
        }
        if (d<0){
            d=d*-1;
        }
        System.out.println("Sum of the two numbers is: "+c);
        System.out.println("Difference of the two numbers is: "+d);

        sc.close();
    }
}
