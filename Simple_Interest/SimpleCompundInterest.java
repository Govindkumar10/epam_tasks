/**

 * 

 * @author Govind Kumar

 *

 */

import java.util.Math;



import static org.junit.Assert.*;



import org.junit.Test;



public class SimpleCompoundInterest

{

   int principle;

   int rate;

   int time;

	@Test

    public SimpleCompoundInterest(int principle,int rate,int time)

  {

        this.principle = principle;

        this.rate=rate;

        this.time = time;

  }

    public double SimpleInterest()

    { 

	   return principle*rate*time/100;

    }

    public double CompoundInterest()

    { 

	return principle *(Math.pow((1 + rate / 100),time));  

    }

    

}