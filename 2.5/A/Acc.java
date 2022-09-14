package A;

class Acc {
	private int id;
	String name;
	String address;
	int panNumber;

	public Acc(int id, String name, String address, int panNumber) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.panNumber = panNumber;
	}

	public void update(String name, String address, int panNumber) {
		this.name = name;
		this.address = address;
		this.panNumber = panNumber;
	}

	public String toString() {
		return ("ID: " + this.id + ", Name: " + this.name + ", Address: " + this.address + ", PAN Number: "
				+ this.panNumber + ", Account type: Home Loan");
	}
}
