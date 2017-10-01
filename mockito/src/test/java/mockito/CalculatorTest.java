package mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
int x,y;
Calculator obj;
	protected void setUp() throws Exception {
		obj =new Calculator();
		x = 2;
		y = 10;
		ICalculator mockObj = mock(ICalculator.class);
		when(mockObj.addition(x, y)).thenReturn(x+y);
		when(mockObj.subtraction(x, y)).thenReturn(y-x);
		when(mockObj.multiply(x, y)).thenReturn(y*x);

		when(mockObj.divide(x, y)).thenReturn((double) (y/x));
		
	obj.setIntObj(mockObj, mockObj);
	}

	protected void tearDown() throws Exception {
		//super.tearDown();
		 x=0;
		 y=0;
		 obj=null;		
	}
	
	public void testAddTwoNums() {
		assertEquals(12, obj.addTwoNums(x, y));
	}
	
	public void testsubTwoNums() {
		assertEquals(8, obj.subTwoNums(x, y));
	}
	public void testdivTwoNums() {
		assertEquals(5.0, obj.divTwoNums(x, y));
	}
	public void testmulTwoNums() {
		assertEquals(20, obj.mulTwoNums(x, y));
	}
}
