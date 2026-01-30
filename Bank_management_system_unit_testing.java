import java.util.*;

public class Bank_management_system_unit_testing{

    private double balance;
    private List<String> transcationHistory;

    public Bank_management_system_unit_testing() {
        balance=0.0;
        transcationHistory=new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be Positive");
        }
        balance+=amount;
        transcationHistory.add("Deposited : "+amount);
    }

    public void withdrawn(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Withdraw amount must be postive");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficent Balance");
        }
        balance-=amount;
        transcationHistory.add("Withdraw : "+amount);
    }

    public double getBalance(){
        return balance;
    }

    public List<String> getTransactionHistory(){
        return transcationHistory;
    }
    
}