public class PatternDemo {

    public static void main(String[] args) {

        System.out.println("========== Task1 单例模式 ==========");
        LogisticsConfig a = LogisticsConfig.getInstance();
        LogisticsConfig b = LogisticsConfig.getInstance();
        System.out.println("单例测试：配置类实例A与实例B是否相同？ -> " + (a == b));
        System.out.println("系统名称：" + a.getSystemName());

        System.out.println();
        System.out.println("========== Task2 简单工厂 ==========");
        // 这里没有 new Truck / new Drone，只给工厂一个字符串
        TransportVehicle v = VehicleFactory.createVehicle("Drone");

        if (v != null) {
            System.out.println("工厂调度：工厂成功分配 -> 🚁 " + v + "，计费启动...");
            System.out.println("本次计费（10kg）：" + v.calculateCost(10.0) + " 元");
        } else {
            System.out.println("工厂调度：无法识别的车型，调度失败");
        }
        System.out.println("测试未知车型 Bike -> " + VehicleFactory.createVehicle("Bike"));

        System.out.println();
        System.out.println("========== Task3 建造者模式 ==========");
        // 全程没有 new LogisticsOrder(...)，先生成 Builder，链式配完再 build
        LogisticsOrder order = new LogisticsOrder.Builder("OD-999")
                .sender("Alice")
                .receiver("Bob")
                .fragile(true)
                .insuredAmount(1000.0)
                .build();

        order.printInfo();
    }
}
