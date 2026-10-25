public class LogisticsOrder {
    private String orderId;
    private String sender;
    private String receiver;
    private boolean fragile;
    private double insuredAmount;

    private LogisticsOrder(Builder b){
        this.orderId = b.orderId;
        this.sender = b.sender;
        this.receiver = b.receiver;
        this.fragile = b.fragile;
        this.insuredAmount = b.insuredAmount;
    }
    public void printInfo() {
        System.out.println("运单生成：订单号[" + orderId + "], 寄件人[" + sender
                + "], 收件人[" + receiver + "], 易碎品[" + fragile
                + "], 保价[" + insuredAmount + "元]");
    }
    public static class Builder{
        private String orderId;
        private String sender;
        private String receiver;
        private boolean fragile;
        private double insuredAmount;

        public Builder(String orderId) {
            this.orderId = orderId;
        }


        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder receiver(String receiver) {
            this.receiver = receiver;
            return this;
        }

        public Builder fragile(boolean fragile) {
            this.fragile = fragile;
            return this;
        }

        public Builder insuredAmount(double insuredAmount) {
            this.insuredAmount = insuredAmount;
            return this;
        }
        public LogisticsOrder build() {
            return new LogisticsOrder(this);
        }


    }

}
