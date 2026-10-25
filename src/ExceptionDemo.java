public class ExceptionDemo {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        String[] ids = {"T-001", "T-002", "T-003", "T-004"};
        double[] amounts = {-100, 20000, 500, 888};

        for (int i = 0; i < amounts.length; i++) {
            System.out.println("=== 测试" + (i + 1) + "：金额 " + amounts[i] + " ===");

            try {
                boolean ok = service.processPayment(amounts[i], ids[i]);
                System.out.println("支付结果：" + ok);

            } catch (SystemMaintenanceException e) {
                System.out.println("捕获到系统维护异常：" + e.getMessage());
                System.out.println("根因：" + e.getCause());
            } catch (Exception e) {
                System.out.println("外层兜底：" + e.getMessage());
            }

            System.out.println();
        }
    }
}
