import java.util.*;
public class Strong 
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
            int fact = 1;
            for (int i = 1; i <= r; i++) 
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("Number is a Strong number.");
        } 
        else 
        {
            System.out.println("Number is not a Strong number.");
        }
    }
    
}
