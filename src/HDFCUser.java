import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface{

    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterrest;

    public HDFCUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterrest = 5.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterrest() {
        return rateOfInterrest;
    }

    public void setRateOfInterrest(double rateOfInterrest) {
        this.rateOfInterrest = rateOfInterrest;
    }

    @Override
    public double checkBalance() {
        return balance;

    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return " bahot paisa hai apne pass" +balance;
    }

    @Override
    public String withdrawMoney(int amount, String enterpassword) {
        if(Objects.equals(enterpassword,password)){
            if(amount > balance){
                return " be leave in limit  --OK--";
            }else{
               balance = balance- amount;
               return " current amount --:--" +balance;
            }
        }
        else{
            return "worng password";
        }
    }

    @Override
    public double calculateInterest(int year) {
        return (balance*year*rateOfInterrest)/100;
    }
}
