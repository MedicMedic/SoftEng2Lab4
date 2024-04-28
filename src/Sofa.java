public class Sofa implements Furniture {
    private double weight;

    public Sofa(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}