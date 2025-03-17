import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        if(a+b%2==0){
            System.out.println(a+b + " is Even");
        }
        else{
            System.out.println(a+b +" is Odd");
        }
        sc.close();
    }
}