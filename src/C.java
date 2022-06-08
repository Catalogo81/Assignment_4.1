import java.util.Scanner;

public class C
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        try
        {
            String s = "";
            System.out.println("Enter a number: ");

            //Read a line and store it in s;
            int a = scanner.nextInt(Integer.parseInt(s));

            try {
                System.out.println("Enter another number: ");

                // Read a line and store it in s;
                int b = scanner.nextInt(Integer.parseInt(s));

                System.out.println("Product: " + a * b);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Number Format Exception: " + e.getMessage());
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception: " + e.getMessage());
        }


    }

}
