import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Question_2
{
    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("MyFile.txt");

            BufferedReader bufferedReader = new BufferedReader(file);

            String fileInfo = null;

            fileInfo = bufferedReader.readLine();


        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found Exception Error: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of code...");
    }
}
