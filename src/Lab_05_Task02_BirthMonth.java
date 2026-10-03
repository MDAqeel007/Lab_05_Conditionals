import java.util.Scanner;
public class Lab_05_Task02_BirthMonth
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the birth month: ");
        int birthMonth = input.nextInt();
        if  (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
