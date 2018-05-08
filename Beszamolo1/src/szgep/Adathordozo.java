package szgep;

public abstract class Adathordozo {
			private String type;
			private double capacity;
			
		public Adathordozo(String type, double capacity) {
				super();
				this.type = type;
				this.capacity = capacity;
}
		public String getType() {
			return type;
		}
		
		public double getCapacity() {
			return capacity;
		}
 
		public abstract double maradekHely();
 
}
