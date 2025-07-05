public class BmiService {
    public double calculate(double weightInKg, double lengthInMetres1, double lengthInMetres2) {
        double index;
        index = weightInKg / (lengthInMetres1 * lengthInMetres2);
        return (int) index;
    }
}