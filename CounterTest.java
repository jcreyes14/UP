import static org.junit.Assert.*;

import org.junit.Test;


public class CounterTest {

	@Test
	public void multiplesof15test() {
		Counter tester = new Counter();
		int result = tester.fizzbuzz(15);
		assertEquals(16,result);
		result = tester.fizzbuzz(45);
		assertEquals(46,result);
		result = tester.fizzbuzz(90);
		assertEquals(91,result);
		result =tester.fizzbuzz(99);
		assertEquals(99,result);
		fail("Not yet implemented");
	}
	
	@Test
	public void multiplesof5test() {
		Counter tester = new Counter();
		assertEquals(21,tester.buzz(20));
		assertEquals(51,tester.buzz(50));
		assertEquals(101,tester.buzz(100));
		assertEquals(31,tester.buzz(31));
		fail("Not yet implemented");
	}
	
	@Test
	public void multiplesof3test() {
		Counter tester = new Counter();
		assertEquals(22,tester.fizz(21));
		assertEquals(49,tester.fizz(48));
		assertEquals(67,tester.fizz(66));
		assertEquals(2,tester.fizz(2));
		fail("Not yet implemented");
	}

}
