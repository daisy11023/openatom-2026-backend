public class ProductCheck {
    public static void main(String[] args){
        //Task1:商品变量
        String name="机械键盘";
        double price=150.0;
        int stock=50;
        boolean onSale=false;
        int quantity=2;

        double total=price*quantity;

        //Task2:包邮判定（总价>=100 或 促销中）
        boolean freeShip=total >= 100 || onSale;

        System.out.println("商品："+name+",单价："+price+"元，促销中："+onSale+",购买"+quantity+"件，总价为："+total+"元");
        System.out.println("是否享受包邮："+freeShip);

        //Task3
        int a=10,b=20;
        System.out.println("交换前：a="+a+",b="+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("交换后：a="+a+",b="+b);
    }
}
