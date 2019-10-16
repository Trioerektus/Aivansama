


public class Profiili {
	private double alennusprosentti;
	
	
	
	public double getAlennusprosentti() {
		return alennusprosentti;
	}
	
	public void setAlennusprosentti(double alennusprosentti) {
		this.alennusprosentti = alennusprosentti;
	}
	
	
	public double laskeAlennus(double hinta, double alennusprosentti) {
		double alennettuhinta=0.0;
		
		alennettuhinta=hinta*(alennusprosentti/100);
		return alennettuhinta;
		
	}
	
	

}
