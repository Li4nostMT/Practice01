public class Exercise03 {

    static String product; //товар
    static int rating; //рейтинг
    static int mark; //оценка

    public static void main(String[] args) {

        mark = 2;
        switch (mark) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> System.out.println("Неизвестная оценка!");
        }
    }
}

