import java.util.Scanner;
public class differentNumber {

  public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Input first number: ");
        int x = s.nextInt();
        System.out.println("Input second number: ");
        int y = s.nextInt();
        System.out.println("Input third number: ");
        int z = s.nextInt();

        if (x == y && x == z)
        {
            System.out.println("All numbers are equal");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Neither all are equal or different");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }
}