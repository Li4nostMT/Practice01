public class Exercise02 {

    static  String trafficLight ="Красный";

    public static void main(String[] args) {

        switch (trafficLight.trim()) {
            case "Красный" -> System.out.println("Машины стоят");
            case "Желтый" -> System.out.println("Приготовиться к движению");
            case "Зеленый" -> System.out.println("Начать движение");
            default -> System.out.println("Неизвестная команда");
        }
    }
}
