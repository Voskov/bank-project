package unitTests;

//import junit.framework.Assert;

import org.junit.*;

import classes.Account;

public class AccountTest {

	@Test
	public void testSanityId() {
		Account acc = new Account(1, 1000);
		Assert.assertEquals(acc.getId(), 1);
	}
	
	@Test
	public void testSanityBalance() {
		Account acc = new Account(1, 1000);
		Assert.assertEquals(acc.getBalance(), 1000.0);
	}

}
