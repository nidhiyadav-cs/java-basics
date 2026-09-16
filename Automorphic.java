import java.util.Scanner;
public class Automorphic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int power = 1;
        while(temp > 0)
        {
            power = power * 10;
            temp = temp / 10;
        }
        if(square % power == n)
        {
            System.out.println("Automorphic number");
        }
        else
        {
            System.out.println("Not an Automorphic number");
        }
    }
}
