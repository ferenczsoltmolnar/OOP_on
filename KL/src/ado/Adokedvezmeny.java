package ado;

public abstract class Adokedvezmeny {
	private String tipus;

	public Adokedvezmeny(String tipus) {
		this.tipus = tipus;
	}

	public String getTipus() {
		return tipus;
	}

	public abstract int getAdoMertek();
}
