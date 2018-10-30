

import org.junit.*;
import static org.junit.Assert.*;

public class AccountServiceTest {

    AccountService service = new AccountService();


    //A Test case, which expect an Exception to be thrown
    //If no exception is thrown, test case is marked as FAILED
    @Test(expected = RuntimeException.class)
    public void testNonExistingAccount(){
        Account acc = service.findAccount(1004);
    }


    //Test withdrawal of amount higher than balance
    @Test
    public void testWithdraw(){
        double beforeAmount = service.findAccount(1001).getAmount();
        service.withdraw(1001,beforeAmount+1000);
        double afterAmount = service.findAccount(1001).getAmount();
        assertEquals(afterAmount, beforeAmount,0);
    }
}
