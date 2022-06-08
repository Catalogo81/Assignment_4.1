
//Question 4: Below, write an unchecked Exception class MyException.
public class MyException extends Exception
{
    private int result;
    MyException(int exeption)
    {
        result = exeption;
    }
    public String toString()
    {
        return "MyException[" + result + "]";
    }

    public static void main(String[] args)
    {
        int number = Integer.parseInt(null);

        System.out.println(number);
    }
}
