public class Account {
    private int accountId;
    private String type;
    private double accountBalance;
    public Account(){
    }
    public Account(int id,String deposit, double balance){
        this.accountId=id;
        this.type=deposit;
        this.accountBalance=balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double setİncBalance(double amount) {
        return this.accountBalance += amount;
    }
    public double setDecBalance(double amount) {
        if(this.accountBalance>0)
            return this.accountBalance -= amount;
        else
            System.out.println("Yeterli bakiye bulunmamakta!");
        return accountBalance;
    }


}
