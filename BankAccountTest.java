import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private Bank_management_system_unit_testing account;

    @BeforeEach
    void setup(){
        account=new Bank_management_system_unit_testing();
    }

    @Test
    void testDeposit(){
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void testWithdraw(){
        account.deposit(1000);
        account.withdrawn(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void testInsufficient(){
        account.deposit(200);
        assertThrows(IllegalArgumentException.class,()->{
            account.withdrawn(500);
        });
    }

    @Test
    void testInvalidDeposit(){
        assertThrows(IllegalArgumentException.class,()->{
            account.deposit(-100);
        });
    }
    
    @Test
    void testTransactionHistory(){
        account.deposit(500);
        account.withdrawn(200);
        assertEquals(2, account.getTransactionHistory().size());
    }
}



// To run
// java -jar junit-platform-console-standalone-1.10.0.jar --class-path . --scan-class-path
