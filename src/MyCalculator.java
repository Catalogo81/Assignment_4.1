//Question 8

import java.util.Scanner;

public class MyCalculator
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        power(num1,num2);
        System.out.println();
    }

    public static long power(int n, int p) throws Exception
    {
        long answer = 1;

        if(n < 0 || p < 0)
        {
            throw new Exception("n or p should not be negative");
        }
        else if(n == 0 && p == 0)
        {
            throw new Exception("n and p should not be zero");
        }
        else
        {
            for(; p != 0; --p)
            {
                answer *= n;
            }


            System.out.println(answer);
            return answer;
        }


    }
}
