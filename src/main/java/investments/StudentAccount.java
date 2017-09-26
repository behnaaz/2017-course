package investments;

public class StudentAccount extends NormalAccount {

    private int miles;

    public void deposit(double amount) {
        super.deposit(amount);
        this.miles += (int)amount;
    }

    public int getMiles() {
        return miles;
    }


}