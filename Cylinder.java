import java.util.Scanner;
public class Cylinder
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the radius of the cylinder:");
        float r=sc.nextFloat();
        System.out.print("Enter the height of the cylinder:");
        float h=sc.nextFloat();
        float volume=3.14f*r*r*h;
        System.out.println("Volume of cylinder is: " + volume);
    }
}
