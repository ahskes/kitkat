public class ProductPrice {
    private final String sku;
    private final double unitPrice;

    public ProductPrice(String sku, double unitPrice) {
        this.sku = sku;
        this.unitPrice = unitPrice;
    }

    public String getSku() {
        return sku;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
