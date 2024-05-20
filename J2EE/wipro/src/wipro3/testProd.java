package wipro3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class testProd {
	public int prod (int x, int y) {
		return x * y;
	}
	@Test
	public void testProd() {
	testProd testObj = new testProd();
	int x=20 , y=3, finalResult=60;
	int functionResult =  testObj.prod(x, y);
	assertEquals (finalResult ,functionResult);
	}

}
