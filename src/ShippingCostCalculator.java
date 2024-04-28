public class ShippingCostCalculator implements ShippingCostVisitor 
{
    public double accept(Chair chair) 
    {
        // Calculate shipping cost for Chair
        return 10.0; // flat rate
    }

    public double accept(Table table) 
    {
        // Calculate shipping cost for Chair
        return 20.0; // flat rate
    }


    public double accept(Sofa sofa) 
    {
        // Calculate shipping cost for Sofa
        return sofa.getWeight() * 0.5; // cost based on weight
    }
}