import java.util.*;
public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n= sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n!= 0) 
        {
            int r = n % 10;
            sum = sum*10 + r*r*r;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("Number is an Armstrong number.");
        } 
        else 
        {
            System.out.println("Number  is not an Armstrong number.");
        }
    }
}
