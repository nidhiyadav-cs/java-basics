import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length:");
        int l=sc.nextInt();
        System.out.print("Enter Breadth:");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area of Rectangle is:"+area);
    }
}


