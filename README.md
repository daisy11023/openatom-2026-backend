# openatom-2026-backend

电子科技大学「成电开放原子工作室」2026 招新笔试 —— 后端方向。

## 目录结构

```
src/            Java 源码（题目 1 - 4）
screenshots/    各题运行结果截图
```

## 题目与文件对照

| 题号 | 考察内容 | 源码 | 运行截图 |
|---|---|---|---|
| 1 | 环境配置、多类调用 | `HelloWorld.java`、`GreetingService.java` | `q1.png` |
| 2 | 数据类型与运算符 | `ProductCheck.java` | `q2.png` |
| 3 | 控制流综合（循环 / 分支 / 递归） | `ToolBox.java` | `q3-1.png`、`q3-2.png` |
| 4.1 | 封装、构造器重载、静态成员 | `Product.java` | `q4-1.png` |
| 4.2 | 抽象类与接口、多态 | `TransportVehicle.java`、`GPSLocatable.java`、`Truck.java`、`Drone.java`、`OopDemo.java` | `q4-2.png` |
| 4.3 | 泛型 | `StorageBox.java` | `q4-3.png` |
| 4.4 | 手写动态数组（扩容与移位） | `MyArrayList.java` | `q4-4.png` |
| 4.5 | 设计模式（单例 / 简单工厂 / 建造者） | `LogisticsConfig.java`、`VehicleFactory.java`、`LogisticsOrder.java`、`PatternDemo.java` | `q4-5.png` |

## 运行方式

用 IntelliJ IDEA 打开本目录，等待索引完成后，打开对应类，右键 `Run` 即可。

命令行方式（JDK 21）：

```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out PatternDemo
```
