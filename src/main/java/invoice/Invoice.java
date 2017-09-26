package invoice;

public class Invoice {

    private int id;
    private double amount;
    private double taxes;

    public Invoice(int id, double amount, double taxes) {
        this.id = id;
        this.amount = amount;
        this.taxes = taxes;
    }

    public Invoice(double amount, double taxes) {
        this(0, amount, taxes);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getTaxes() {
        return taxes;
    }
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getNetValue() {
        return this.amount - this.taxes;
    }

}