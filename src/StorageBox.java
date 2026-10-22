
    public class StorageBox<T> {
        private T item;

        public void storeItem(T item) {
            this.item = item;
        }

        public T retrieveItem() {
            return item;
        }

        public static void main(String[] args) {
            StorageBox<Product> productBox = new StorageBox<>();
            productBox.storeItem(new Product("P001", "机械键盘", 450.0));
            Product p = productBox.retrieveItem();
            System.out.println("📦商品储物箱存取测试：成功取出商品 -> " + p.getName());

            StorageBox<TransportVehicle> deviceBox = new StorageBox<>();
            deviceBox.storeItem(new Drone("D-007"));
            TransportVehicle d = deviceBox.retrieveItem();
            System.out.println("📦设备储物箱存取测试：成功取出设备 -> " + d);
        }
    }


