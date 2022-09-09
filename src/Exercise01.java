public class Exercise01 {
    static double valueProdaj;

    public static void main(String[] args) {

        valueProdaj = 15000;
        double procent;

        if (valueProdaj < 10000) {
            procent = (valueProdaj * (10.0 / 100));
            System.out.printf("Выплата в размере 10%% процентов от %.2f равна %.2f", valueProdaj,procent);
        } else if (valueProdaj > 10000 && valueProdaj <= 20000) {
            procent = (valueProdaj * (15.0 / 100));
            System.out.printf("Выплата в размере 15%% процентов от %.2f равна %.2f", valueProdaj,procent);
        } else if (valueProdaj > 20000) {
            procent = (valueProdaj * (20.0 / 100));
            System.out.printf("Выплата в размере 20%% процентов от %.2f равна %.2f", valueProdaj,procent);
        }
        else System.out.println("Процента нет!");
    }
}
