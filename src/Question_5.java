import java.util.Scanner;

public class Question_5
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ArithmeticException
    {
        int number = 0;

        System.out.println("Press 0 if you are a good programmer: ");
        number = scanner.nextInt();

        if(number != 0)
        {

            throw new ArithmeticException("Sorry you are a bad programmer!");
        }
        else
        {
            System.out.println("Congrats you are a good programmer");
        }

        System.out.println("Code continues...");
    }
}
