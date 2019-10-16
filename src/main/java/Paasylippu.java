





/**
 * @author MVs, 10.10.2019
 *
 */
public class Paasylippu {
	private double Hinta;
	private String Paivamaara;
	
	Paasylippu(double Hinta, String Paivamaara){
		this.Hinta = Hinta;
		this.Paivamaara = Paivamaara;
	}

	public String getPaivamaara() {
		return Paivamaara;
	}

	public void setPaivamaara(String paivamaara) {
		Paivamaara = paivamaara;
	}

	public double getHinta() {
		return Hinta;
	}

	public void setHinta(double hinta) {
		this.Hinta = hinta;
	}	
	
}
