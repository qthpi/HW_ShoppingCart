import java.util.ArrayList;

public class myCalc {
    public static Double calcTotal(ArrayList<Double> prices){
        double sum = 0;
        for (double i: prices) {
            sum += i;
        }
        return sum;
    }
}
