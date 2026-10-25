public class LogisticsConfig {
    private String systemName = "顺风智能仓储系统";
    private static LogisticsConfig instance = new LogisticsConfig();

    private LogisticsConfig() {
        System.out.println(">>> LogisticsConfig 构造器执行了一次");
    }

    public static LogisticsConfig getInstance() {
        return instance;
    }

    public String getSystemName() {
        return systemName;
    }
}
