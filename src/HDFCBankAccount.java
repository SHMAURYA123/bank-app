import java.util.UUID;

public class HDFCBankAccount implements BankAccountInterface {

    private String name;
    private String accountno; //unique UUID
    private String password;
    private double balance;
    final String IFSCCode = "HDFC00324";

    public HDFCBankAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountno = String.valueOf(UUID    .randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    final double rateOfInterest = 7.1;


    public HDFCBankAccount() {

    }

    @Override
    public String fetchBalance(String Password) {
        if (this.password.equals(Password)) {
            return "Your balance is : " + this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Money Added Successfully: Your new Balance is :- " + this.balance;
    }

    @Override
    public String withdrawl(double amount, String Password) {
        if (this.password.equals(Password)) {
            if (amount > this.balance) {
                return "Insufficient Fund";
            }
            this.balance -= amount;
            return "Money withdrawl Successfully : Your New balance is :- " + this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String OldPassword, String NewPassword) {
        if (this.password.equals(OldPassword)) {
            this.password = NewPassword;
            return "Your Password Successfully";
        }
        return "Incorrect Old Password";
    }

    @Override
    public double calculateROI(int Year) {

        return (this.balance * 7.1 * Year) / 100.0;
    }

    @Override
    public String toString() {
        return "HDFCBankAccount{" +
                "name='" + name + '\'' +
                ", accountno='" + accountno + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", rateOfInterest=" + rateOfInterest +
                '}';
    }
}