package exception;

public class BalanceException extends Throwable {
    public BalanceException(String amountIsBiggerBalnce) {
        super(amountIsBiggerBalnce);
    }
}
