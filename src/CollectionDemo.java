import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        OrderAnalyzer analyzer = new OrderAnalyzer();

        analyzer.add(new Order("O001", "Alice", 150.0, List.of("电子", "数码")));
        analyzer.add(new Order("O002", "Bob", -50.0, List.of("服装")));
        analyzer.add(new Order("O003", "Alice", 200.0, List.of("图书", "电子")));
        analyzer.add(new Order("O004", "Charlie", 200.0, List.of("生鲜")));
        analyzer.add(new Order("O005", "Bob", 300.0, List.of("服装", "户外")));

        System.out.println("===== 1. 删除无效订单前 =====");
        for (Order o : analyzer.getOrders()) System.out.println(o);

        analyzer.removeInvalidOrders();
        System.out.println("\n===== 2. 删除金额<=0 后 =====");
        for (Order o : analyzer.getOrders()) System.out.println(o);

        System.out.println("\n===== 3. 标签去重 =====");
        System.out.println(analyzer.getAllUniqueTags());

        System.out.println("\n===== 4. 客户消费汇总 =====");
        for (Map.Entry<String, Double> entry : analyzer.getCustomerSpendMap().entrySet()) {
            System.out.println(entry.getKey() + " 消费合计: " + entry.getValue());
        }

        System.out.println("\n===== 5. 按客户姓名排序 =====");
        for (Order o : analyzer.sortOrdersByCustomerName()) System.out.println(o);

        System.out.println("\n===== 6. 金额降序(同金额按订单号升序) =====");
        List<Order> byAmount = new ArrayList<>(analyzer.getOrders());
        byAmount.sort(
                Comparator.comparingDouble(Order::getAmount).reversed()
                        .thenComparing(Order::getOrderId)
        );
        for (Order o : byAmount) System.out.println(o);
    }
}

