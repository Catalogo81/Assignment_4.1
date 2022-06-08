import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        Question();
    }//end main

    public static void Question()
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
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndex Out Of Bounds Exception: " + e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Number Format Exception: " + e.getMessage());
        }
        catch (Exception e) //any general exception will be caught in this superclass
        {
            System.out.println("Exception: " + e.getMessage());
        }


    }

}//end class

