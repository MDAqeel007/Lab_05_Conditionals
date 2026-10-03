import java.util.Scanner;
public class Lab_05_Task01_ShippingCostCalculator
{
    public static void main ()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of an item: ");
        int price = in.nextInt();
        double shipmentCost = 0;
        if (price >= 100) {
            System.out.println("The price of an item is : $" + price);
            System.out.println("Shipping is free");
        }
            else
            {
                shipmentCost = price * 0.02;
                System.out.println("The shipping cost is $" + shipmentCost);
                double totalCost = price + shipmentCost;
                System.out.println("Total cost is $" + totalCost);
            }
    }
}
