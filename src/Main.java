import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" SBI -->Enter ur name , balance to create an account");
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        //>>SBIUser
        SBIUser user = new SBIUser(name,balance,password);

        // add money
        String message = user.addMoney(10000);
        System.out.println(message);

        //withdraw money
        System.out.println("enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("enter the password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));


  // HDFCUser
        System.out.println(" HDFC -->Enter ur name , balance to create an account");
        String name1 = sc.next();
        String password1 = sc.next();
        double balance1 = sc.nextDouble();
        HDFCUser user1 = new HDFCUser(name1,balance1,password1);

        // add moneygit init
        String message1 = user1.addMoney(10000);
        System.out.println(message1);

        //withdraw money
        System.out.println("enter amount you want to withdraw");
        int money1 = sc.nextInt();
        System.out.println("enter the password");
        String pass1 = sc.next();
        System.out.println(user1.withdrawMoney(money1,pass1));

    }
}