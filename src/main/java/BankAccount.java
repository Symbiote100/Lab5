import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Lists different kinds of bank accounts.
     */
    public enum BankAccountType {
        /**
         * Checkings account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Workplace .
         */
        WORKPLACE
    }

    /**
     * Number of the account.
     */
    private int accountNumber;
    /**
     * Type of the account.
     */
    public BankAccountType accountType;
    /**
     * Balance of the account.
     */
    private double accountBalance;
    /**
     * Name of the owner.
     */
    private String ownerName;
    /**
     * Rate of interest.
     */
    public double interestRate;
    /**
     * Amount of interest earned.
     */
    private double interestEarned;

    /**
     * Constructor to construct a BankAccount object.
     * @param name Name to be set
     * @param accountCategory Type of account to be set
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        accountNumber = 0;
        accountBalance = 0;
        interestRate = 0;
        interestEarned = 0;
    }

    /**
     * Returns account number.
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets account number to parameter.
     * @param acc account number to be set to
     */
    public void setAccountNumber(final int acc) {
        accountNumber = acc;
    }

    /**
     * Returns balance of the bank account.
     * @return balance
     */
    public double getBalance() {
        return accountBalance;
    }

    /**
     * Sets balance of the account to the parameter.
     * @param bal balance to be set to
     */
    public void setBalance(final double bal) {
        accountBalance = bal;
    }

    /**
     * Returns name of the bank account.
     * @return name
     */
    public String getName() {
        return ownerName;
    }

    /**
     * Sets name of the account to the parameter.
     * @param name name to be set to
     */
    public void setName(final String name) {
        ownerName = name;
    }

    /**
     * Returns amount of interest earned.
     * @return interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Sets amount of interest earned to the parameter.
     * @param interest interest earned to be set to
     */
    public void setInterestEarned(final double interest) {
        interestEarned = interest;
    }

}