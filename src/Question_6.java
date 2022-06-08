import java.util.Scanner;

public class Question_6
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[])
    {
        try
        {
            int number = scanner.nextInt();
            int[] array = new int[number];
            scanner.nextLine();
            for(int i = 0; i < number; i++)
            {
                array[i]=Integer.parseInt(scanner.nextLine());
            }

            String string = scanner.nextLine();
            System.out.println(string.charAt(10));

            solution(array);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invalid division");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Format mismatch");
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Index is invalid");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is invalid");
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Exception encountered");
        }
        finally
        {
            System.out.println("Exception Handling Completed");
        }


    }
    static void solution(int[] array) throws Exception
    {
        int answer = 0;

        for(int i = 0; i < 10; i++)
        {
            for(int j = i + 1; j < 10; j++)
            {
                answer += array[i] / array[j];
            }
        }
        throw new MyException(answer);
    }
}
