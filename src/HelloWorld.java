public class HelloWorld {

    // 题1 Task2：经典入口写法（不用 Java 25 的极简 void main，企业项目里还是这套）
    public static void main(String[] args) {
        System.out.println("Hello world");        // 题面要求的固定输出

        // 题1 Task3：实例化另一个类，调用它的方法打印 Hello!
        GreetingService service = new GreetingService();
        service.sayHello("小王");
    }
}
