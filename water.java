import java.util.Scanner;
 
public class pattern
{            
    public static void main(String[] args)
    {
        int water = 65;
                for (int i = 0; i<= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) water + " ");
            }
            water++;
            System.out.println();
        }
    }
}