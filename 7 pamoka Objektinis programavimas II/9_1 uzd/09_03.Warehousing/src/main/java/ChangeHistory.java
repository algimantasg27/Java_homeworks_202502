import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> listHistory;

    public ChangeHistory() {
        this.listHistory =  new ArrayList<Double>();
    }

    public void add(double status) {
        listHistory.add(status);
    }

    public void clear() {
        this.listHistory.clear();
    }

    @Override
    public String toString() {
        return this.listHistory.toString();
    }

    public double maxValue() {
        double max = 0;

        for (Double value: listHistory) {
            max = (max < value) ? max = value : max;
        }

        return max;
    }

    public double minValue() {

        if (this.listHistory.size() == 0) {
            return 0;
        }

        double min = 9999999.99;

        for (Double value : listHistory) {
            min = (min > value) ? min = value : min;
        }

        return min;
    }

    public double average() {
        double sum = 0;
        int count = 0;

        for (Double value: listHistory) {
            sum += value;
            count++;
        }

        return sum / count * 1.0;
    }
}
