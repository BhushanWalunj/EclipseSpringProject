package LoggerInSpring;

public class Main {
    public static void main(String[] args) {
        LogController logController = new LogController();
        logController.log();
        logController.toString();
    }
}
