package sajat;

public class Gyermek extends Szemely {
	private String iskola;
	public Gyermek(String name, int kor, String iskola) {
		super(name, kor);
		this.iskola = iskola;
		// TODO Auto-generated constructor stub
	}

	
	public String getIskola() {
		return iskola;
	}


	@Override
	public String toString() {
		return "Gyermek [iskola=" + iskola + ", toString()=" + super.toString()
				+ "]";
	}



}
