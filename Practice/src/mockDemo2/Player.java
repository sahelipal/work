package mockDemo2;

public class Player {
		   private String name;
		   private String country;
		   private int totalRun;
		   private int totalWkt;
		   // setter & getter methods
		public Player(String name, String country, int totalRun, int totalWkt) {
			super();
			this.name = name;
			this.country = country;
			this.totalRun = totalRun;
			this.totalWkt = totalWkt;
		}
		public Player() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getTotalRun() {
			return totalRun;
		}
		public void setTotalRun(int totalRun) {
			this.totalRun = totalRun;
		}
		public int getTotalWkt() {
			return totalWkt;
		}
		public void setTotalWkt(int totalWkt) {
			this.totalWkt = totalWkt;
		}
		
}
