package simpleStartupGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSimpleStartup {

	@Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }

	@Test
	public void testCheckYourSelf() {
		SimpleStartup test = new SimpleStartup(new int []{2,3,4}); 
		int guess = 3;
		String result = test.checkYourself(guess);
		assertEquals("guess of 3 showing a Hit", "Hit", result);
		
		guess = 1;
		
		result = test.checkYourself(guess);
		assertEquals("guess of 3 showing a Hit", "Miss", result);
		
		guess = 2;
		test.checkYourself(guess);
		guess = 4;
		result = test.checkYourself(guess);
		assertEquals("expected Kill", "Kill", result);
	}
	
	
	@Test
	public void testSetLocation() {
		SimpleStartup test = new SimpleStartup(new int [] {2,3,4});
		test.setLocationCells(new int [] {3,4,5});
		assertEquals("expected output after changing location", 3, test.getLocations()[0]);
		assertEquals("expected output after changing location", 4, test.getLocations()[1]);
		assertEquals("expected output after changing location", 5, test.getLocations()[2]);
	}
	

}
