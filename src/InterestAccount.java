public class InterestAccount extends Account{

    private double interestRate;
    private int day;

    public InterestAccount(int interestRate, int day) {
        super();
        this.interestRate = interestRate;
        this.day = day;
    }

    public double amountOfAccumulation(double interest, int day) {
        double dailyInterest=(this.getAccountBalance()/100)*(interest/365)*day;
         this.setAccountBalance(this.getAccountBalance() + dailyInterest);
        return dailyInterest;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
