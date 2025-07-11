public class BmiService {
    public int calculate(int weightInKg, double lengthInMetres1) {
        double index;
        index = weightInKg / (lengthInMetres1 * 2);
        return (int) index;
    }
}