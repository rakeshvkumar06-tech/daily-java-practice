class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class BankAccount {

    public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 7000;

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException("Insufficient Balance");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}