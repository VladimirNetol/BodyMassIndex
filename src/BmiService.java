public class BmiService {
    public double calculate(double weightInKg, double lengthInMetres1) {
        double index;
        index = weightInKg / (lengthInMetres1 * 2);
        return (int) index;
    }
}