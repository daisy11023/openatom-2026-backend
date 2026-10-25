import java.util.*;

public class OrderAnalyzer {

    private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public void removeInvalidOrders() {

        orders.removeIf(o -> o.getAmount() <= 0);
    }


    public Set<String> getAllUniqueTags() {
        Set<String> tagSet = new HashSet<>();
        for (Order o : orders) {
            tagSet.addAll(o.getTags());
        }
        return tagSet;
    }

    public Map<String, Double> getCustomerSpendMap() {
        Map<String, Double> spendMap = new HashMap<>();
        for (Order o : orders) {
            String name = o.getCustomerName();
            if (spendMap.containsKey(name)) {
                double old = spendMap.get(name);
                spendMap.put(name, old + o.getAmount());
            } else {
                spendMap.put(name, o.getAmount());
            }
        }
        return spendMap;
    }

    public List<Order> sortOrdersByCustomerName() {
        List<Order> result = new ArrayList<>(orders);
        result.sort(Comparator.comparing(Order::getCustomerName));
        return result;
    }

    // 给 main 用的 getter：main 要遍历订单列表，得能拿到它
    public List<Order> getOrders() {
        return orders;
    }
}