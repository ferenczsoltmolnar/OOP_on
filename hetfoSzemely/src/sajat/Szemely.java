package sajat;

public class Szemely {

	private String name;
	private int kor;
	
	public Szemely(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	@Override
	public String toString() {
		return "Szemely [name=" + name + ", kor=" + kor + "]";
	}
	
	public boolean eletkorNagyobbE(Szemely masik){
		return getKor() > masik.getKor();
		
	}
}

