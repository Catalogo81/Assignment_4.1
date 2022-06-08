public class ArrayIndexOutOfBounds
{
    public static void main(String[] args)
    {
        int b[] = new int[0];
        min(b);
    }

    /** Return the minimum value in b. Throw a RuntimeException with
     * message "min of 0 values doesn’t exist" if b is empty. */
    public static int min(int[] b)
    {
        int min = 0;
        try
        {
            min = b[0];

            for (int k = 0; k < b.length; k++)
            {
                if (b[k] > min)
                    min = b[k];
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        return min;
    }


}
