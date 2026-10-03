import java.util.Scanner;
public class Lab_05_Task03_PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the party affiliation: D,R,I,or other: ");
        String name = input.nextLine();
        if (name.equals ("D") || name.equals ("d"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (name.equals("R") || name.equals ("r"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (name.equals("I") || name.equals ("i"))
        {
            System.out.println("You get an Independent Person");

        }
        else
            {
            System.out.println("You get Other");
            }
    }
}
