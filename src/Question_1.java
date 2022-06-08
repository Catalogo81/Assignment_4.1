import java.util.Scanner;

public class Question_1
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ArithmeticException
    {
        int number_1 = 3;
        int number_2 = 0;
        int age = 0;
        double answer = 0;

        try
        {
            answer = number_1/number_2;
            System.out.println("Answer: " + answer);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally //when I have something that must be executed even if there's and exception
        {
            System.out.println("Code that must execute");
        }

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        if(age < 18)
        {
            throw new ArithmeticException("you are not old enough to visit this site");
        }
        else
        {
            System.out.println("Rest of Code...");
        }
    }
}
