
public class Product {
    private String id;
    private String name;
    private  double price;

    private static int totalProductCount=0;

    public Product() { totalProductCount++; }

    public Product(String id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
        totalProductCount++;
    }
    public String getId()  {return id;}
    public void setId(String id)  {this.id=id;}
    public String getName(){return name;}
    public void setName(String name)  {this.name=name;}
    public double getPrice()  {return price;}
    public void setPrice(double price)  {this.price=price;}

    public static int getTotalCount()  {
        return totalProductCount;
    }
    public void printInfo(){
        System.out.println("商品信息：["+id+"]"+name+"，价格："+price+"元");

    }public static void main(String[] args){
        Product p1=new Product("P001"," 机械键盘",450.0);
        Product p2=new Product("P002"," 蓝牙耳机",299.0);


    p1.printInfo();
    p2.printInfo();

    System.out.println("系统当前共创建了 "+Product.getTotalCount()+" 个商品实例。");
}
}
