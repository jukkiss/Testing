import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    
    private Account account;
    
    @Before
    public void setUp() {
        account = new Account();
    }
    
    @Test
    public void testInitialBalance() {
        assertEquals(0.0, account.getBalance(), 0.01);
    }
    
    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
        
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);
    }
    @Test
    public void testWithdrawSuccess() {
        account.deposit(100.0);
        double withdrawn = account.withdraw(50.0);
        assertEquals(50.0, withdrawn, 0.01);
        assertEquals(50.0, account.getBalance(), 0.01);
    }
    @Test
    public void testWithdrawFail() {
        account.deposit(50.0);
        double withdrawn = account.withdraw(100.0);
        assertEquals(0.0, withdrawn, 0.01);
        assertEquals(50.0, account.getBalance(), 0.01);
    }
    @Test
    public void testGetBalance() {
        account.deposit(200.0);
        assertEquals(200.0, account.getBalance(), 0.01);
    }
}
