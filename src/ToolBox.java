import java.util.Scanner;
public class ToolBox {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("【欢迎使用多功能工具箱】");

        while (true){
            System.out.println("1. 成绩评定");
            System.out.println("2. 空心金字塔");
            System.out.println("3. 递归阶乘");
            System.out.println("4. 退出系统");
            System.out.print("请选择功能：");

            int choice=scanner.nextInt();

            if (choice==1){
                System.out.print("请输入分数：");
                int score = scanner.nextInt();
                if (score < 0 || score > 100) {
                    System.out.println("分数不合法，请输入 0-100");
                } else {
                    System.out.println("成绩评定（if-else）：" + gradeByIf(score));
                    System.out.println("成绩评定（switch）：" + gradeBySwitch(score));
                }

            }else if (choice==2){
                System.out.print("请输入金字塔层数：");
                int n = scanner.nextInt();

                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    if (i==1||i==n){
                       for (int j=1;j<=2*i-1;j++){
                       System.out.print("*");
                       }
                    }else{
                        System.out.print("*");
                        for (int j=1;j<=2*i-3;j++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }else if (choice==3){
                System.out.print("计算阶乘：");
                int n=scanner.nextInt();
                System.out.println("计算结果："+new ToolBox().calculateFactorial(n));

            }else if (choice==4){
                System.out.println("再见");
                break;
            }else {
                System.out.println("输入无效");
            }
        }

    }
    public static String gradeByIf(int score){
        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else
            return "E";
    }
    public static String gradeBySwitch(int score){
        switch (score/10){
            case 10:
            case 9:   return "A";
            case 8:   return "B";
            case 7:   return "C";
            case 6:   return "D";
            default:  return "E";
        }
    }
    public int calculateFactorial(int n){
        if (n <= 1) return 1;
        return n*calculateFactorial(n-1);
    }

}
