import java.util.HashMap;
import java.util.Map;

public class CheckOut {
    private final Map<String, PricingRule> pricingRules;
    private final Map<PricingRule, Integer> cart;

    public CheckOut(Map<String, PricingRule> pricingRules) {
        this.pricingRules = pricingRules;
        this.cart = new HashMap<>();
    }

    public void scan(String sku) {
        PricingRule rule = pricingRules.get(sku);
        Integer count = cart.getOrDefault(rule, 0);
        cart.put(rule, count + 1);
    }

    public double total() {
        double total = 0;
        for (Map.Entry<PricingRule, Integer> entry : cart.entrySet()) {
            Integer count = entry.getValue();
            PricingRule rule = entry.getKey();
            total += rule.getPrice(count);
        }
        return total;
    }


}
