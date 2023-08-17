// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HDFCBankAccount sourabh= new HDFCBankAccount("Sourabh","SH2014",2000);
        System.out.println(sourabh);
        System.out.println(sourabh.fetchBalance("random")); // wrong password
        System.out.println(sourabh.fetchBalance("SH2014")); // correct output
        // addmoney
        System.out.println(sourabh.addMoney(200000));
        // withdrawl
        System.out.println(sourabh.withdrawl(300000,"SH2014")); // Insufficient
        System.out.println(sourabh.withdrawl(10000,"SH2014"));
        // check balance
        System.out.println(sourabh.fetchBalance("SH2014"));
        // change Password
        System.out.println(sourabh.changePassword("SH2014","SH2015"));
        // check password change or not
        System.out.println(sourabh.fetchBalance("SH2015"));
        // calculate rate of interest
        System.out.println(sourabh.calculateROI(13));
        }
    }
