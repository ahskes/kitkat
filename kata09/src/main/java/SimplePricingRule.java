public class SimplePricingRule implements PricingRule {
    private final ProductPrice productPrice;

    public SimplePricingRule(ProductPrice productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public double getPrice(int quantity) {

        return quantity * productPrice.getUnitPrice();
    }
}