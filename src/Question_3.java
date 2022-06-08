import java.io.IOException;

public class Question_3
{
    public static void main(String[] args)
    {
        try
        {
            int array[] = new int[10];
            String name = null;

            System.out.println("Error: " + array[-1]);
            int answer = 8/0;
            System.out.println("answer: " + answer);
            System.out.println("Error: " + name.length());
            answer = Integer.parseInt("null") ;
            System.out.println("answer: " + answer);
        }
//        catch(ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException | NullPointerException e)
//        {
//            System.out.println("Exception: " + e.getMessage());
//        }
        catch(Exception e) //or I can use the superclass
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
