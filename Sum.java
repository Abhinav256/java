import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int a, b, c;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Number: ");
	a=sc.nextInt();
	System.out.print("Enter Second Number: ");
	b=sc.nextInt();
	c=a+b;
	System.out.println("The sum of 2 numbers is: "+c);
    }
}