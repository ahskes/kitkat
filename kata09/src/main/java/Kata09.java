import java.util.HashMap;
import java.util.Map;

public class Kata09 {

    public static void main(String[] args) {
        Map<String, PricingRule> pricingRules = new HashMap<>();
        pricingRules.put("A", new SimplePricingRule(new ProductPrice("A", 5)));
        pricingRules.put("B", new SimplePricingRule(new ProductPrice("B", 5)));
        pricingRules.put("C", new BulkPricingRule(new ProductPrice("C", 4), 3, 10));
        pricingRules.put("D", new BulkPricingRule(new ProductPrice("D", 5), 2, 9));
        CheckOut checkOut = new CheckOut(pricingRules);
        checkOut.scan("A");
        checkOut.scan("A");
        checkOut.scan("B");
        checkOut.scan("C");
        checkOut.scan("C");
        checkOut.scan("C");
        checkOut.scan("D");
        System.out.println("Total:" + checkOut.total());


    }
}
