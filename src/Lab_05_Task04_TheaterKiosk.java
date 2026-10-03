import java.util.Scanner;
public class Lab_05_Task04_TheaterKiosk
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int yourAge = input.nextInt();
        if (yourAge >= 21 )
        {
            System.out.println("You get a Wrist Band");
        }
    }
}
