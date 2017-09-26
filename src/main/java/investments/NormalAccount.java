package investments;

public class NormalAccount {

    protected double balance;

    public NormalAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double valor) {
        if (valor <= this.balance) {
            this.balance -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void interests(){
        this.balance += this.balance * 0.01;
    }

    public double getBalance() {
        return balance;
    }

}