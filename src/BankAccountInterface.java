public interface BankAccountInterface {
    String fetchBalance(String Password);
    String addMoney(double amount);
    String withdrawl(double amount , String Password);
    String changePassword(String OldPassword,String NewPassword);
    double calculateROI(int Year);
}
