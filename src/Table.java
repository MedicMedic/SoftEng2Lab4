public class Table implements Furniture
{
    public double accept(ShippingCostVisitor visitor) 
    {
        return visitor.accept(this);
    }
}
