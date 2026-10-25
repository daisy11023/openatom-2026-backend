import java.util.List;

public class Order {

    private String orderId;
    private String customerName;
    private double amount;
    private List<String> tags;

    public Order(String orderId, String customerName, double amount, List<String> tags) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.tags = tags;
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
    public List<String> getTags() { return tags; }

    @Override
    public String toString() {
        return "订单[" + orderId + "] 客户:" + customerName
                + " 金额:" + amount + " 标签:" + tags;
    }
}