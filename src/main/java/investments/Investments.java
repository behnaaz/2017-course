package investments;

import java.util.Arrays;
import java.util.List;

public class Investments {

    public static void main(String[] args) {

        for (NormalAccount account : allAccounts()) {
            account.interests();

            System.out.print("New balance: ");
            System.out.println(account.getBalance());
        }
    }

    private static List<NormalAccount> allAccounts() {
        return Arrays.asList(
                normalAccount(100),
                normalAccount(150),
                studentAccount(200)
        );
    }

    private static NormalAccount studentAccount(double amount) {
        StudentAccount c = new StudentAccount();
        c.deposit(amount);
        return c;
    }

    private static NormalAccount normalAccount(double valor) {
        NormalAccount c = new NormalAccount();
        c.deposit(valor);
        return c;
    }

}