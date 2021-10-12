package Day11;

public class Warehouse {
    private int balance;
    private int countOrders;

    @Override
    public String toString() {
        return "Warehouse{" +
                "balance=" + balance +
                ", countOrders=" + countOrders +
                '}';
    }

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }
}
