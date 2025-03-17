import java.util.*;
public class GreatestAmongThreeNumbers {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number:");
        a = sc.nextInt();
        System.out.print("Enter the second number:");
        b = sc.nextInt();
        System.out.print("Enter the third number:");
        c = sc.nextInt();
        if (a>b){
            max=a;
        }
        else{
            max=b;
        }
        if (c>max)
        {
            max=c;
        }
        System.out.print("The greatest number is " + max);
        sc.close();
    }
}
