import java.util.Scanner;

public class temperature
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is : " + tempF);
    }
}
