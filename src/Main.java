public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        System.out.print("Ваш индекс массы тела составляет: ");
        System.out.print(service.calculate(98, 1.87));

    }
}