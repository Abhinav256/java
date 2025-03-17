import java.util.*;
class MaxNum
{
    public static void main(String args[])
    {
        int a, b;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter First Number: ");
	    a=sc.nextInt();
	    System.out.print("Enter Second Number: ");
	    b=sc.nextInt();
	    if(a>b){
			System.out.println(a+" is greater than "+b);
		}
		else if(a<b){
			System.out.println(b+" is less than "+a);
		}
		else{
			System.out.println(a+" is equal to "+b);
		}
        sc.close();
    }
}