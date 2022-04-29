public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(50, 165);
        System.out.format("Ваш индекс массы тела: " + "%.1f", bmi);
    }
}
