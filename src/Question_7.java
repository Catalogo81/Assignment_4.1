import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_7
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int x, y;

        try
        {
            System.out.println("Enter first number");
            x = scanner.nextInt();
            System.out.println("Enter second number");
            y = scanner.nextInt();



            int answer = x / y;
            System.out.println("Answer: " + answer);


        }
        catch (InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
