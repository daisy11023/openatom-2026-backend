// public = "公开的"：允许其他类（比如 Main）使用它
// class = "类"：Java 代码都必须装在类这个"盒子"里
// GreetingService = 类的名字，必须和文件名一模一样
public class GreetingService {
    // 下面整行叫"方法定义"，拆开看：
    // public  → 公开的，别的类可以调用
    // void    → 这个方法"不返回任何东西"（只干活，不交还结果）
    // greet   → 方法名（自己起的名字，像动词，表示它能干嘛）
    // String name → 参数：调用时必须递进来一段文字（字符串），这里给这段文字起名叫 name
    public void greet(String name){
        // System.out.println(...) = 在屏幕上打印一行字，打印完自动换行
        // "你好, " + name + "..." → 用 + 号把几段文字拼接成一句完整的话
        // name 没有引号：它是个变量，会被递进来的实际内容替换
        // 引号里的字原样打印
        System.out.println("你好, " + name + "! 欢迎来到开放原子工作室!");
    }// 方法的结束花括号：这个方法的功能到此为止



}// 类的结束花括号：这个类的内容到此为止
