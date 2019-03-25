/**

*

* @author Govind Kumar

* Unit test cases for Calculator

*

*

*/



import static org.junit.jupiter.api.Assertions.*;



class CalculatorUnitTestCase{

    

    @org.junit.jupiter.api.Test

        

	public void testOperation() {

		Calculator c = new Calculator();

		assertEquals(7, c.Operation(4,3,"Addition"));

		assertEquals(12, c.Operation(44,32,"Subtraction"));

		assertEquals(76, c.Operation(38,2,"Multiplication"));

        	assertEquals(20, c.Operation(40,2,"Division"));

	}

}