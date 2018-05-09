package szgep;

public  class Merevlemez extends Adathordozo{
	private double foglaltTerulet;

	public Merevlemez(String type, double capacity, double foglaltTerulet) {
		super(type, capacity);
		this.foglaltTerulet = foglaltTerulet;
			
		
	}

	@Override
	public double maradekHely() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getFoglaltTerulet() {
		return foglaltTerulet;
	}

	public double szabadTerulet() {
		return getCapacity() - foglaltTerulet;
	}

	@Override
	public String toString() {
		return "Merevlemez [foglaltTerulet=" + foglaltTerulet
				+ ", szabadTerulet()=" + szabadTerulet() + ", getType()="
				+ getType() + ", getCapacity()=" + getCapacity() + "]";
	}
	public boolean nagyobbMeretuuMint(Merevlemez masikMerevlemez) {
		
		return szabadTerulet() > masikMerevlemez.szabadTerulet();
	
}
	public static Merevlemez nagyobbKapacitas(Merevlemez elsoMerevlemez, Merevlemez masodikMerevlemez) {
		if (elsoMerevlemez.getCapacity()>
			masodikMerevlemez.getCapacity()) {
			return elsoMerevlemez;
		} else {
			return masodikMerevlemez;
		}
	}
}