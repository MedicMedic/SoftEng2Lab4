public class ShippingCostCalculator implements ShippingCostVisitor 
{
    public double visit(Chair chair) 
    {
        // Calculate shipping cost for Chair
        return 10.0; // flat rate
    }

    public double visit(Table table) 
    {
        // Calculate shipping cost for Chair
        return 20.0; // flat rate
    }


    public double visit(Sofa sofa) 
    {
        // Calculate shipping cost for Sofa
        return sofa.getWeight() * 0.5; // cost based on weight
    }
}