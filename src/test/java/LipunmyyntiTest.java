

import static org.junit.Assert.*;

import org.junit.Test;

public class LipunmyyntiTest {

	@Test
	public void laskehinta() {
		//fail("Not yet implemented");
		Lipunmyynti olio = new Lipunmyynti();
		Paasylippu olio2 = new Paasylippu(0, null);
		Profiili olio3 = new Profiili();
		
		double tested = 75.0;
		olio2.setHinta(75.0);
		//tested = olio2.getHinta(int);
		assertEquals(tested, olio2.getHinta(),0.1);
		
	}

}
