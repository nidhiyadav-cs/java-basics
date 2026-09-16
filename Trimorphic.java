import java.util.Scanner;
public class Trimorphic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int cube = n * n * n;
        int temp = n;
        int power = 1;
        while(temp > 0)
        {
            power = power * 10;
            temp = temp / 10;
        }
        if(cube % power == n)
        {
            System.out.println("Trimorphic number");
        }
        else
        {
            System.out.println("Not a Trimorphic number");
        }
    }
}
