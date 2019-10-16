

import static org.junit.Assert.*;

import org.junit.Test;

public class LipunmyyntiTest {
	
	@Test
	public void laskehinta() {
		//fail("Not yet implemented");
		Lipunmyynti olio = new Lipunmyynti();
		Paasylippu olio2 = new Paasylippu(0, null);
		Profiili olio3 = new Profiili();
		
		double hinta = 50.0;
		double alennuspros = 25.0;
		double tested = 12.50;
		//olio2.setHinta(75.0);
		//tested = olio2.getHinta(int);
		assertEquals(tested, olio3.laskeAlennus(hinta,alennuspros),0.1);
		
		System.out.println(olio3.laskeAlennus(hinta,  alennuspros));
	}

}
