public class Chair implements Furniture 
{
    public double accept(ShippingCostVisitor visitor) 
    {
        return visitor.accept(this);
    }
}