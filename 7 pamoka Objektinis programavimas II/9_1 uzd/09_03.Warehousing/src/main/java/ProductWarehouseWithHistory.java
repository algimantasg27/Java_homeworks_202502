public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.setBalance(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double realAmount = super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());
        return realAmount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
