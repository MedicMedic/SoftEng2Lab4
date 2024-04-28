import java.util.Scanner;

public class ShippingCostMenu
{
    public static void main(String[] args)
    {
        ShippingCostVisitor calculator = new ShippingCostCalculator();
        int i = 1;
        Scanner input = new Scanner(System.in);

        while (i == 1) 
        {
            System.out.println("Shipping Cost Calculator");
            System.out.println("Select a piece of furniture:\n1. Chair\n2. Table\n3. Sofa\n0. Exit");
            System.out.print("Input selection: ");
            int selection = input.nextInt(); // Move this line inside the loop

            switch(selection)
            {
                //Chair
                case 1: Furniture chair = new Chair();
                        System.out.println("Chair Shipping Cost: " + chair.accept(calculator));
                        break;
                //Table
                case 2: Furniture table = new Table();
                        System.out.println("Table Shipping Cost: " + table.accept(calculator));
                        break;
                case 3: System.out.print("Input sofa weight: ");
                        double sofaWeight = input.nextDouble();
                        Furniture sofa = new Sofa(sofaWeight);
                        System.out.println("Sofa Shipping Cost: " + sofa.accept(calculator));
                        break;
                case 0: i--;
                        break;
            }
        }

        input.close();
    }
}
