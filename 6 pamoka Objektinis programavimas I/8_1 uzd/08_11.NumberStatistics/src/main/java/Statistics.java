
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {}

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        return (double)sum / (double) count;
    }
}
