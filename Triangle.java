import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle:");
        int b=sc.nextInt();
        System.out.print("Enter the height of the triangle:");
        int h=sc.nextInt();
        float area=(0.5f*b*h);
        System.out.print("Area of the triangle is:"+area);
    }
}