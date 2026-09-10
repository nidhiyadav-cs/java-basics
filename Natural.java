import java.util.*;
public class Natural 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers are:");
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(i + " ");
        }
    }
}
