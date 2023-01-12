import java.util.Objects;
import java.util.UUID;
import java.util.logging.SocketHandler;

public class SBIUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterrest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterrest = 6.5;
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
        return "your new balance is" +balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredpassword) {
        if(Objects.equals(enteredpassword,password)) {
            if (amount > balance) {
                return "sorry bro  ! paisa nahi hai";
            } else {
                  balance = balance - amount;
                  return "paisa hi paisa  --:--"+balance;
            }
        }
        else{
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int year) {
        return (balance*year*rateOfInterrest)/100;
    }
}
