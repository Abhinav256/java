import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year:");
        year=sc.nextInt();
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.print(year+" is leap year");
        }
        else{
            System.out.print(year+" is not a leap year");
        }
        sc.close();
    }
}
