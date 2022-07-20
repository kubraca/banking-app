import java.util.ArrayList;


public class Customer {
    private String customerName;
    private double balance;
    private int numberOfAccounts;
    private ArrayList<Account> accounts=new ArrayList<Account>();


    public Customer(String name, double balance, int numberOfAccount) {
        this.customerName = name;
        this.balance = balance;
        this.numberOfAccounts = numberOfAccount;
    }

    public Customer() {

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumberOfAccount() {
        return numberOfAccounts;
    }

    public void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccounts = numberOfAccount;
    }

    public double getBalance() {
        return balance;
    }

    public double setİncBalance(double balance) {
        return this.balance += balance;
    }

    public double setDecBalance(double balance) {
        if (balance > 0)
            return this.balance -= balance;
        else
            System.out.println("Yeterli bakiye bulunmamakta!");
        return this.balance;
    }

    public void addAcc(Account acc) {
        this.accounts.add(acc);
        this.numberOfAccounts++;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void sendMoney(Account senderAcc, int money, Account recieverAcc){

        if(senderAcc.getAccountBalance()>money){
            recieverAcc.setİncBalance(money);
            senderAcc.setDecBalance(money);
        }
        else System.out.println("Yeterli bakiye bu hesapta bulunmamaktadır!");

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", balance=" + balance +
                ", numberOfAccounts=" + numberOfAccounts +
                ", accounts=" + accounts +
                '}';
    }
}

