public class BulkPricingRule implements PricingRule {
    private final double bulkPrice;
    private final int bulkQuantity;
    private final ProductPrice productPrice;

    public BulkPricingRule(ProductPrice productPrice, int bulkQuantity, double bulkPrice) {
        this.productPrice = productPrice;
        this.bulkPrice = bulkPrice;
        this.bulkQuantity = bulkQuantity;

    }

    @Override
    public double getPrice(int quantity) {
        int bulkCount = quantity / bulkQuantity;
        int remainder = quantity % bulkQuantity;
        return bulkCount * bulkPrice + productPrice.getUnitPrice() * remainder;
    }
}